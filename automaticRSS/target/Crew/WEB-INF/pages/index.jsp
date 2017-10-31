<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">

<head>

	<title>配信メール管理 | CREW 管理</title>

	<jsp:include page="template/library.jsp" />
</head>

<body>
<!-- pagebody start -->
<div class="pagebody">

	<jsp:include page="template/header.jsp" />
	
	<!-- contents start -->
	<div class="contents wrapper clearfix">
		<div class="crumb"><a href="http://crew.navy/manage">アフィリセンター管理トップ</a>&nbsp;&gt;&gt;&nbsp;一括メール配信管理</div>
						<!-- side start -->
		<div class="side">
						<div class="side_box margin_b_20">
				<div class="side_box_inner">
					<div class="side_box_body">
						<h3 class="orange">一括メール配信</h3>
						<ul class="side_menu">
							<li class="m_orange"><a href="http://crew.navy/manage/mails">一括メール配信管理</a></li>
							<li class="m_orange"><a href="http://crew.navy/manage/error_mails">エラーメール管理</a></li>
						</ul>
						
					</div>
				</div>
			</div>		</div>
		<!-- side end -->

		<!-- main start -->
		<div class="main">
		

		
			<h2 class="orange margin_b_20">一括メール配信一覧</h2>
			
			<div class="rightbtn_box">
				<a href="http://crew.navy/manage/affiliates" class="large orange button">新規登録(アフィリエイター宛)</a>			</div>
		</div>
		
		<div class="main_1c">
		
			<div class="infotab">
				<ul class="clearfix">
					<li class="base">該当件数：246件 (1件目〜100件目 100件表示)</li>
				</ul>
			</div>
			
			<table>
				<tbody><tr>
					<th width="6%"><a href="http://crew.navy/manage/mails/index/sort:ManageMail.id/direction:asc" class="desc">ID</a></th>
					<th><a href="http://crew.navy/manage/mails/index/sort:ManageMail.title/direction:asc">タイトル</a></th>
					<th width="12%"><a href="http://crew.navy/manage/mails/index/sort:ManageMail.target/direction:asc">配信対象</a></th>
					<th width="13%"><a href="http://crew.navy/manage/mails/index/sort:ManageMail.send_datetime/direction:asc">配信予定日時</a></th>
															<th width="8%"><a href="http://crew.navy/manage/mails/index/sort:ManageMail.status/direction:asc">ステータス</a></th>
					<th width="6%"><a href="http://crew.navy/manage/mails/index/sort:ManageMail.status/direction:asc">配信数</a></th>
					<th width="6%"><a href="http://crew.navy/manage/mails/index/sort:ManageMail.status/direction:asc">エラー</a></th>
					<th width="13%">操作</th>
				</tr>
			<tr>
					<td align="right">35109</td>
					<td>BBPラスト</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-18 18:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						501					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:35109/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/35109" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">35033</td>
					<td>BBP_9_17</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-17 12:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						501					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:35033/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/35033" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34949</td>
					<td>BBP9_16_10:00</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-16 10:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						502					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34949/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34949" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34941</td>
					<td>BBP9_15_19:00</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-15 19:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						502					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34941/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34941" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34937</td>
					<td>BBP9_15_18:00</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-15 18:07</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						502					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34937/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34937" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34895</td>
					<td>BBP9_15_10:00</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-15 10:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						503					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34895/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34895" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34860</td>
					<td>BBP_9_14</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-14 18:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						503					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34860/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34860" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34846</td>
					<td>BBP_9_13</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-13 19:30</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						502					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34846/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34846" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34756</td>
					<td>BBP_9/12_16:00</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-12 16:24</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						492					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34756/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34756" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34737</td>
					<td>BBP_9/12_12:00</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-12 12:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						491					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34737/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34737" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34685</td>
					<td>BBP３日目１８時</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-11 18:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						491					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34685/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34685" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
								<tr>
					<td align="right">34681</td>
					<td>BBP３日目１０時</td>
					<td align="center">アフィリエイター</td>
					<td align="center">2017-09-11 10:00</td>
															<td class="status_leave" align="center">
						配信済み					</td>
					<td align="right">
						487					</td>
					<td align="right">
						<a href="http://crew.navy/manage/error_mails/index/mail_id:34681/deleted:" target="_blank">28</a>					</td><td align="center">
						<a href="http://crew.navy/manage/mails/edit/34681" class="small green button input">編集</a>												<span class="small white button input nolink">削除</span>
											</td>
				</tr>
							</tbody></table>

						<div class="paging">
			<span class="prev disabled">&lt; 戻る</span><span class="current">1</span><span><a href="http://crew.navy/manage/mails/index/page:2">2</a></span><span><a href="http://crew.navy/manage/mails/index/page:3">3</a></span><span class="next"><a href="http://crew.navy/manage/mails/index/page:2" rel="next">次へ &gt;</a></span>			</div>
		</div>
		<!-- main start -->	
	</div>
	<!-- contents end -->
	<!-- footer start -->
	<div class="footer">
		<div class="wrapper">
			<ul class="footer_navi clearfix margin_b_20">
				<li class="s_white"><a href="http://crew.navy/manage">トップページ</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/product_groups">案件管理</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/contracts/free">成約・アフィリエイト報酬管理</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/affiliates">アフィリエイター管理</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/mails">配信メール管理</a></li>
				<li class="s_white"><a href="http://crew.navy/manage/mails#">システム設定</a></li>
			</ul>
			
			<address>Copyright© <a href="http://kuchiko.net/" target="_blank">Ku-Chi-Ko</a> All Rights Reserved</address>		</div>
		
	</div>
	<!-- footer end -->
</div>

<form method="post" action="http://member.kuchiko.net/member/login.php" id="GoSupport" target="_blank">
	<input type="hidden" name="login_id" value="ceo@4lead.co.jp">
	<input type="hidden" name="password" value="444#crew@4lead">
</form>

<!-- pagebody end -->
