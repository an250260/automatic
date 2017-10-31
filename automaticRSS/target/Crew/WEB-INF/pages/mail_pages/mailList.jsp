<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>

<title>配信メール管理 | CREW 管理</title>

<jsp:include page="../template/library.jsp" />


<script>

function deleteAjaxCall(id) {
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "api/mail/deleteMailData",
		data : JSON.stringify(id),
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			$("#mailData" + id).remove();
		},
		error : function(e) {
		},
		done : function(e) {
		}
	});
}

function deleteMailData(id){
	ConfirmDeleteDialog("削除しますか", id);
}

function ConfirmDeleteDialog(message, id) {
	$('<div></div>')
			.appendTo('body')
			.html(
					"<div style='width: 200px'><h6>" + message
							+ "?</h6></div>")
			.dialog(
					{
						modal : true,
						title : '削除確認',
						zIndex : 10000,
						autoOpen : true,
						width : 'auto',
						resizable : false,
						buttons : {
							はい : function() {
								// $(obj).removeAttr('onclick');                                
								// $(obj).parents('.Parent').remove();

								$(this).dialog("close");
								deleteAjaxCall(id);
							},
							いいえ : function() {
								$(this).dialog("close");
							}
						},
						close : function(event, ui) {
							$(this).remove();
						}
					});
};

	function AjaxGetList() {
		$
				.ajax({
					type : "POST",
					contentType : "application/json",
					url : "api/mail/getlist",
					dataType : 'json',
					timeout : 100000,
					success : function(data) {
						var dataToAppend = "";
						var num = 0;
						$
								.each(
										data,
										function(i, item) {

											dataToAppend += "<tr id='mailData" + item.id + "'><td>"
													+ item.id
													+ "</td><td>"
													+ item.title
													+ "</td><td>"
													+ item.target.split(",").length + " 人"
													+ "</td><td>"
													+ item.time;
													
													if(item.status == "配信済み"){
														dataToAppend += "</td><td class='status_leave'>";
													}else{
														dataToAppend += "</td><td>";
													}
													
													dataToAppend +=  item.status
													+ "</td><td>"
													+ item.sendNumber
													+ "</td><td>"
													+ item.errorNumber
													+ "</td> <td style='width:13%'><a onclick = 'sendEditForm(" + item.id + ")' class='small green button input'>編集</a>"
													+ "<span onclick='deleteMailData(" + item.id + ")' class='small white button input'>削除</td></tr>";
											num++;
										});
						$("#dataTableBody").append(dataToAppend);
						$("#RecNum").append("該当件数：" + num + " 件 (一ページ100件限表示)");
					},
					error : function(e) {
						alert("error");
					},
					done : function(e) {
					}
				});

	}

	function sendEditForm(id){
		$('#mailIdForm').val(id);
		$('#editSubmitForm').submit();
	}
	
	$(document).ready(function() {
		AjaxGetList();

		$('#tableData').paging({
			limit : 10
		});
	});
</script>
</head>

<body>
	<!-- pagebody start -->
	<div class="pagebody">

		<jsp:include page="../template/header.jsp" />

		<div class="contents wrapper clearfix">

			<jsp:include page="../template/navMail.jsp" />

			<!-- main start -->
			<div class="main">
				<h2 class="orange margin_b_20">一括メール配信一覧</h2>

				<div class="rightbtn_box">
					<a href="../affiliates/list" class="large orange button">新規登録(アフィリエイター宛)</a>
				</div>
			</div>

			<div class="main_1c">

				<div class="infotab">
					<ul class="clearfix">
						<li id="RecNum" class="base"></li>
					</ul>
				</div>

				<table id="tableData" class="table table-bordered table-striped">
					<thead id="dataTableHeader">
						<tr>
							<th>ID</th>
							<th>タイトル</th>
							<th>配信対象</th>
							<th>配信予定日時</th>
							<th>ステータス</th>
							<th>配信数</th>
							<th>エラー</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody id="dataTableBody">

					</tbody>
				</table>
			</div>
			<!-- main start -->
		</div>

		<form action="../mail/manage" id="editSubmitForm" method="POST">
			<input type="hidden" name="MailIdForm" value="" id="mailIdForm"/>
		</form>

		<!-- footer start -->
		<jsp:include page="../template/footer.jsp" />
		<!-- footer end -->
	</div>
	<!-- pagebody end -->