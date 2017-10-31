<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>

	<title>配信メール管理 | CREW 管理</title>

	<jsp:include page="../template/library.jsp" />

	<script>
	
	
	function generateAffiliatesList(data){
		var dataToAppend = "";
		var num = 0;
		var maillingTarget = new Array();
		$.each(data, function(i, item){
			
			dataToAppend += "<tr><td style='width:6%'>" + item.id +"</td><td style='width:15%'>" + item.firstname_kanji + " " + item.lastname_kanji + "</td><td>"  + item.email + "</td><td style='width:8%'>" + item.rank +  "</td><td style='width:8%'>"
			+ item.status + "</td><td style='width:9%'>" + item.mail_permission + "</td><td style='width:8%'>" + item.mail_err + "</td><td style='width:10%'>" + item.register_date.slice(0,-2) + 
			"</td><td style='width:13%'><a class='small green button input'>編集</a><a class='small yellow button input'>成績</a><a class='small blue button input'>タグ</a><a class='small button input'>削除</a></td></tr>";
			num++;
			maillingTarget.push(item.id);
	
		});
		$( "#dataTableBody" ).append(dataToAppend);
		$("#RecNum").append("該当件数：" + num + " 件 (一ページ100件限表示)");
		
		//alert(JSON.stringify(maillingTarget));
		$('#maillingList').val(maillingTarget);
		$('#numberOfMail').val(num);
		
		$('#tableData').paging({limit:10});
	}
	
    $(document).ready(function() {
    	searchAffiliatesViaAjax(1);
    	AjaxGetAffiliatesRank();
    	AjaxGetAffiliatesStatus();
    	AjaxGetAffiliatesPermit();
    });
    
    
    function messenger(){

    	  var data ='"get_started":{"payload":"test"}';
    	  var data2 ='"persistent_menu":[{"locale":"default","composer_input_disabled":true,"call_to_actions":[{"title":"My Account","type":"nested","call_to_actions":[{"title":"Pay Bill","type":"postback","payload":"PAYBILL_PAYLOAD"},{"title":"History","type":"postback","payload":"HISTORY_PAYLOAD"},{"title":"Contact Info","type":"postback","payload":"CONTACT_INFO_PAYLOAD"}]},{"type":"web_url","title":"Latest News","url":"http://petershats.parseapp.com/hat-news","webview_height_ratio":"full"}]},{"locale":"zh_CN","composer_input_disabled":false}]' ;
    	   	  
    	  
    		$.ajax({ 
    			//type:"POST",
    			type:"GET",
    			url: "https://graph.facebook.com/v2.6/me/messenger_profile?fields=persistent_menu&access_token=EAAbOpeZA7k3YBAIcLV3kT0Kgkafo2yZCxryLqF1tVwoeCjMyrxCaVhd3W4pTVLDZATrwsSVjEJfMHIGThaCB0en3vR7pItkcXroZAiBK5cjUJAsnUx9vvHKjH1BCGLRpWuZCUI0TicGkg5BiDgcUXqi011ZBoffRyMxaWt1DnJT9GrWZAXw29rn", 
    			//url: "https://graph.facebook.com/v2.6/me/messenger_profile?access_token=EAAbOpeZA7k3YBAIcLV3kT0Kgkafo2yZCxryLqF1tVwoeCjMyrxCaVhd3W4pTVLDZATrwsSVjEJfMHIGThaCB0en3vR7pItkcXroZAiBK5cjUJAsnUx9vvHKjH1BCGLRpWuZCUI0TicGkg5BiDgcUXqi011ZBoffRyMxaWt1DnJT9GrWZAXw29rn",
    			dataType: 'json',
    			contentType: 'application/json',
    			processData: false,
    			//data: data2, 

    			success: function(data, textStatus){

    			
    			},
    			complete: function(XMLHttpRequest, textStatus){
    			},
    			error: function(XMLHttpRequest, textStatus, errorThrown){
    			}
    		});
    		}
    
    
    
    
    
 	</script>
</head>

<body>
<!-- pagebody start -->
<div class="pagebody">

	<jsp:include page="../template/header.jsp" />

<div class="contents wrapper clearfix">
	<jsp:include page="../template/navAffiliates.jsp" />

<!-- main start -->
<div class="main">
			<h2 class="orange margin_b_20">アフィリエイター管理</h2>
<input type="button" onclick="messenger()" value="click me"/>
				<form id="ManageAffiliateIndexForm" method="post" accept-charset="utf-8">
				<table class="margin_b_0">
						<tbody><tr>
							<th width="20%">アフィリエイターID</th>
							<td colspan="3">
								<div class="input text"><input type="text" id="ManageAffiliateIdSearch"></div>
								<span class="gray_s">カンマ区切り複数指定可</span>
							</td>
						</tr>
						<tr>
							<th>姓</th>
							<td width="30%"><div class="input text"><input maxlength="45" type="text" id="ManageAffiliateFamilyName"></div></td>
							<th width="20%">名</th>
							<td><div class="input text"><input maxlength="45" type="text" id="ManageAffiliateGivenName"></div></td>
						</tr>
						<tr>
							<th>メールアドレス</th>
							<td><div class="input text"><input maxlength="255" type="text" id="ManageAffiliateUsername"></div></td>
							<th>接続IPアドレス</th>
							<td><div class="input text"><input maxlength="45" type="text" id="ManageAffiliateIpaddress"></div></td>
						</tr>
						<tr>
							<th>登録日(From)</th>
							<td><div class="input text"><input style="font-size: 15px" value="" type="text" id="ManageAffiliateCreatedFrom"/></div></td>
							<th>登録日(To)</th>
							<td><div class="input text"><input style="font-size: 15px" value="" type="text" id="ManageAffiliateCreatedTo"/></div></td>
						</tr>
						<tr>
							<th>ランク</th>
							<td><div class="input select">
								<select style="font-size: 15px" multiple="multiple" id="ManageAffiliateAffiliateRankId">
		
								</select></div>
							</td>
							<th>ステータス</th>
							<td><div class="input select">
								<select style="font-size: 15px" multiple="multiple" id="ManageAffiliateStatus">

							</select></div></td>
						</tr>
						<tr>
							<th>メール送信</th>
							<td><div class="input select"><select style="font-size: 15px" id="ManageAffiliateMailDeliveryPermit">

								</select></div></td>
<!-- 							<th>不正判定猶予</th>
							<td><div class="input select"><select style="font-size: 15px" id="ManageAffiliateBlackGrace">
								<option value=""></option>
								<option value="1">猶予期間中のみ</option>
								<option value="2">猶予期間でない</option>
							</select></div></td> -->
						</tr>
<!-- 						<tr>
							<th>信頼</th>
							<td colspan="3"><div class="input select"><select name="data[ManageAffiliate][trust]" id="ManageAffiliateTrust">
							<option value=""></option>
							<option value="1">信頼するアフィリエイター(不正チェック対象外)</option>
							<option value="0">一般アフィリエイター</option>
						</select></div></td>
						</tr> -->
						<tr>
							<th>報酬</th>
							<td><div class="input text"><input style="font-size: 15px" type="text" id="ManageAffiliateEarn"/></div></td>
							<th>提供メール件数</th>
							<td><div class="input text"><input style="font-size: 15px" type="text" id="ManageAffiliateSellNum"/></div></td>
						</tr>
												
					</tbody></table>
					<table class="search_option margin_b_0">
						<tbody><tr>
							<td class="padding10"><input onclick = "searchAffiliatesViaAjax(2)" class="large orange button" type="button" value="この条件で検索する"></td>
						</tr>
					</tbody></table>

				</form>				
				<form id="ManageAffiliateIndexForm">
				<table class="search_option margin_b_0">
					<tbody><tr>
						<td class="padding10"><input class="large gray button" type="submit" value="CSVダウンロード"></td>
					</tr>
					</tbody>
				</table>
				</form>				
				<form action="../mail/manage" id="ManageAffiliateIndexForm" method="post" accept-charset="utf-8" >
					<input type="hidden" name="MaillingList" value="" id="maillingList"/>
					<input type="hidden" name="NumberOfMail" value="" id="numberOfMail"/>
				<table class="search_option margin_b_0">
					<tbody><tr>
						<td class="padding10"><input class="large yellow button" type="submit" value="一斉メール配信"></td>
					</tr>
				</tbody>
				</table>				
				</form>				
				<form id="ManageAffiliateIndexForm" >
				<table class="search_option">
					<tbody><tr>
						<td class="padding10"><input class="large blue button" type="submit" value="アフィリエイトタグ生成"></td>
					</tr>
				</tbody>
				</table>
				</form>				
				<div class="rightbtn_box">
								<a href="/partner/affiliates/add" class="large orange button" target="_blank">新規アフィリエイター登録</a>				</div>
				
		</div>
	<!-- main start -->	
		
	<!-- main_1c Start -->
		<div class="main_1c">
		
			<div class="infotab">
				<ul class="clearfix">
					<li id="RecNum" class="base"></li>
				</ul>
			</div>
			<div id ="tableContainer">
		<table id="tableData" class="table table-bordered table-striped">
		  <thead id="dataTableHeader">
   			 <tr>
            	  <th>ID</th>
            	  <th>氏名</th>
            	  <th>E-Mail</th>
           		  <th>ランク</th>
            	  <th>ステータス</th>
				  <th>メール送信</th>
                  <th>配信エラー</th>
                  <th>登録日時</th>
                  <th>操作</th>
            </tr>
  		</thead>
          <tbody id="dataTableBody">
  		  </tbody>
		</table>
			</div>
	</div>
					
	</div>
	<!-- footer start -->
	<jsp:include page="../template/footer.jsp" />
	<!-- footer end -->
</div>
<!-- pagebody end -->
