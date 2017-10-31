$(function(){
	
	//tooltip
	$( document ).tooltip({
			items: '[ipsearch]',
			tooltipClass: 'tooltip-ipsearch',
			content: function() {
				var element = $(this);
				if(element.is('[ipsearch]')){
					var ipaddress = element.attr('ipsearch');
					return '<iframe src="http://www.iputilities.net/result.php?userip=' + ipaddress + '" width="980" height="540" />';
				}
			}
	});
	
	//バルーン
	$.each($('span.help'), function(){
		var contents = null;
		if($(this).data('help')){
			contents = $('#' + $(this).data('help')).html();
		}
		
		$(this).balloon({ 
			position: "right", 
			css: {
				opacity: 1.0
			},
			contents: contents
		});
	});
	$.each($('span.help_contract_detail'), function(){
		var contents = null;
		if($(this).data('help')){
			contents = $('#' + $(this).data('help')).html();
		}
		
		$(this).balloon({ 
			position: "right", 
			css: {
				opacity: 1.0,
				width: '700px',
			},
			contents: contents
		});
	});
	
	// /manage/totals
	$('#ManageTotalCreatedFrom').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 0, minute: 0, second: 0});
	$('#ManageTotalCreatedTo').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 23, minute: 59, second: 59});
	$(function () {
		$('#ManageTotalIndexForm').submit(function () {
			$(this).find(':submit').attr('disabled', 'disabled');
		});
	});
	$(function () {
		$('#ManageTotalCsvForm').submit(function () {
			$(this).find(':submit').attr('disabled', 'disabled');
		});
	});
	
	// /manage/products
	$('#ManageProductStartDate').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', minDate:'0d', maxDate:'1y'});
	$('#ManageProductEndDate').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', minDate:'0d', maxDate:'1y'});
	$("#ManageProductPayment2ndDelayCondition3").datepicker({changeMonth: true, changeYear: true, dateFormat: 'yy-mm'});
	
	setManageProuctMailReplaces();
	setManageProuctContent();
	
	
	$('#ManageMailReplaceIdButton').click(function(){ $('#ManageAutoreplyTemplate4Body').val( $('#ManageAutoreplyTemplate4Body').val() + $('#ManageMailReplaceIdText').val() ); });
	
	
	// /manage/payments
	$("#ManageAffiliatePaymentDate").datepicker({changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	
	
	// /manage/affiliates
	$('#ManageAffiliateCreatedFrom').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 0, minute: 0, second: 0});
	$('#ManageAffiliateCreatedTo').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 23, minute: 59, second: 59});
	
	
	// /manage/contracts
	$('#ManageContractCreatedFrom').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 0, minute: 0, second: 0});
	$('#ManageContractCreatedTo').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 23, minute: 59, second: 59});
	$('#ManageContractProductPriceNextPaymentDueDateFrom').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 0, minute: 0, second: 0});
	$('#ManageContractProductPriceNextPaymentDueDateTo').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 23, minute: 59, second: 59});
	
	$("#ManageContractPaymentDueDateFrom").datepicker({changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	$("#ManageContractPaymentDueDateTo").datepicker({changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	
	$('#ManageContractPaymentDateFrom').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 0, minute: 0, second: 0});
	$('#ManageContractPaymentDateTo').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 23, minute: 59, second: 59});
	
	// /manage/contracts/free
	$('#ManageContractFreeCreatedFrom').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 0, minute: 0, second: 0});
	$('#ManageContractFreeCreatedTo').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 23, minute: 59, second: 59});
	
	
	// /manage/contract_details
	$('#ManageContractDetailCreatedFrom').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 0, minute: 0, second: 0});
	$('#ManageContractDetailCreatedTo').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 23, minute: 59, second: 59});
	
	$("#ManageContractDetailPaymentDueDateFrom").datepicker({changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	$("#ManageContractDetailPaymentDueDateTo").datepicker({changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	
	$('#ManageContractDetailPaymentDateFrom').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 0, minute: 0, second: 0});
	$('#ManageContractDetailPaymentDateTo').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', hour: 23, minute: 59, second: 59});
	
	// /manage/mails
	$('#ManageMailSendDatetime').datetimepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd', timeFormat: 'HH:mm:ss', minDate:'0d', maxDate:'1m'});
	setAfterTimePretty('#ManageMailSendDatetime', '#ManageMailSendDatetime_pretty');
	setManageMailReplaces();
	setMailInsertAffiliateTag();	//アフィリタグ生成
	
	// /manage/autoreply_templates
	setManageAutoreplyTemplateMailReplaces();
	
	
	// /manage/products/form
	$('#product_lp_id').change(function(){
		var res = location.href.match(/(.+\/manage\/products\/form\/[0-9]+)/);
		if(res != null && 1 in res){
			location.href = res[1] + '/' + $('#product_lp_id').val();
		}
	});
	

	// /manage/sites/edit
	/*
	$('input[type="radio"][name="data[ManageSite][available_new_affiliater]"]').change(function(){
		if($(this).val() == 1){
			$('.new_affiliater_special_url').hide();
			console.log("1");
		}else{
			$('.new_affiliater_special_url').show();
			console.log("0");
		}
	});
	$('input[type="radio"][name="data[ManageSite][available_new_affiliater]"]:checked').trigger('change');
	*/
	
	// /manage/sites/select_design
	$('#ManageSiteImgHeaderUnset').change(function(){
		$("#ManageSite_img_header").toggle();
	});
	$('#ManageSiteImgFooterUnset').change(function(){
		$("#ManageSite_img_footer").toggle();
	});
	
	// /manage/totals/check
	$('#check_all_level_1').change(function(){
		$(".check_level_1").prop('checked', $(this).prop('checked') );
	});
	
	$('#check_all_level_2').change(function(){
		$(".check_level_2").prop('checked', $(this).prop('checked') );
	});
	
	$('input[type="radio"][name="data[ManageTotal][type]"]').change(function(){
		var checked = $(this).val();
		if(checked == 1){
			//ブラック
			$('#ManageTotalSendMail').removeAttr("disabled");
		}else{
			//保留
			$('#ManageTotalSendMail').attr("disabled", "disabled");
			$('#ManageTotalSendMail').removeAttr("checked");
		}
		
	}).trigger('change');
	
	//一括承認
	$('#update_affiliate_approval_all').click(function(){
		$(".update_affiliate_approval").prop("checked", this.checked);
	});
	
	// /manage/error_mails
	$('#stop_mail_all').click(function(){
		$(".check_error_mails").prop("checked", this.checked);
	});
	
	// /manage/analyses
	$('#ManageAnalysisCreatedFrom').datepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	$('#ManageAnalysisCreatedTo').datepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	
	// /manage/content_analyses
	$('#ManageContentAnalysisCreatedFrom').datepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	$('#ManageContentAnalysisCreatedTo').datepicker({ controlType: 'select', changeMonth: true, changeYear: true, dateFormat: 'yy-mm-dd'});
	
});


///manage/contracts
function updateAffiliateApproval(){
	$('.update_affiliate_approval').each(function() {
		$('<input>').attr({
			type: 'hidden',
			name: $(this).attr('name'),
			value: $(this).prop('checked') ? '1' : '0'
 		}).appendTo('#UpdateAffiliateApprovalForm');
	});
}

// /manage/error_mails
function stopErrorMail(){
	$('.check_error_mails').each(function() {
		$('<input>').attr({
			type: 'hidden',
			name: $(this).attr('name'),
			value: $(this).prop('checked') ? '1' : '0'
 		}).appendTo('#stopErrorMailForm');
	});
}

///manage/error_mails
function deleteErrorMail(){
	$('.check_error_mails').each(function() {
		$('<input>').attr({
			type: 'hidden',
			name: $(this).attr('name'),
			value: $(this).prop('checked') ? '1' : '0'
 		}).appendTo('#deleteErrorMailForm');
	});
}

/**
 * src日時文字列をもとに、現在時刻との相対文字列をdestに書き込む
 * また、changeイベント、5秒ごとのintervalで動作するようになる
 * @param srcSelector
 * @param destSelector
 */
function setAfterTimePretty(srcSelector, destSelector){
	$(srcSelector).change( function() {
		$(destSelector).text(prettyDate($(srcSelector).val()));
	}).trigger('change');
	setInterval(function(){ $(destSelector).text(prettyDate($(srcSelector).val())); }, 5000);
}

/**
 * textareaの指定位置に文字列を挿入する
 */
function insertTextAtPosision(obj, pos, txt) {
    obj.focus();
    if (/*@cc_on!@*/false) {	//IE判定
        pos.text = txt;
        pos.select();
    } else {
        var s = obj.value;
        var np = pos + txt.length;
        obj.value = s.substr(0, pos) + txt + s.substr(pos);
        obj.setSelectionRange(np, np);
    }
}

/**
 * 指定したtextareaのキャレットを取得する
 */
function getCaretPosition(obj) {
    obj.focus();
    var pos;
    if (/*@cc_on!@*/false) {	//IE判定
        pos = document.selection.createRange();
    } else {
        pos = obj.selectionStart;
    }
    return pos;
}

/**
 * メールテンプレートの置換タグ挿入用(AutoreplyTemplate用)
 */
function setMailReplaceButton(controller, mail_id, tagtype){
	$('#' + controller + mail_id + 'Replace' + tagtype + 'Button')
	.click(function(){
		insertTextAtPosision(
				$('#ManageAutoreplyTemplate' + mail_id + 'Body').get(0),
				getCaretPosition($('#ManageAutoreplyTemplate' + mail_id + 'Body').get(0)),
				$('#' + controller + mail_id + 'Replace' + tagtype + 'Text').val());
	});
}

/**
 * メールテンプレートの置換タグ挿入用(一括配信用)
 */
function setMailReplaceButtonForMails(controller, tagtype){
	$('#' + controller + 'Replace' + tagtype + 'Button')
	.click(function(){
		insertTextAtPosision(
				$('#ManageMailBody').get(0),
				getCaretPosition($('#ManageMailBody').get(0)),
				$('#' + controller + 'Replace' + tagtype + 'Text').val());
	});
}

function setMailInsertAffiliateTag(){
	var affiliate = {"ManageAffiliate":{"id":$('#ManageMailReplaceIdText').val()}};
	
	$('#ManageMailInsertAffiliateTagButton')
	.click(function(){
		insertTextAtPosision(
				$('#ManageMailBody').get(0),
				getCaretPosition($('#ManageMailBody').get(0)),
				getTag(affiliate));
	});
}

function setManageAutoreplyTemplateMailReplaces(){
	setMailReplaceButton('ManageAutoreplyTemplate', 1, 'AffiliateId');
	setMailReplaceButton('ManageAutoreplyTemplate', 1, 'AffiliateEmail');
	setMailReplaceButton('ManageAutoreplyTemplate', 1, 'AffiliatePassword');
	setMailReplaceButton('ManageAutoreplyTemplate', 1, 'AffiliateFamilyName');
	setMailReplaceButton('ManageAutoreplyTemplate', 1, 'AffiliateGivenName');
	setMailReplaceButton('ManageAutoreplyTemplate', 1, 'CenterName');
	setMailReplaceButton('ManageAutoreplyTemplate', 1, 'AffiliateLoginUrl');
	
	setMailReplaceButton('ManageAutoreplyTemplate', 2, 'AffiliateId');
	setMailReplaceButton('ManageAutoreplyTemplate', 2, 'AffiliateEmail');
	setMailReplaceButton('ManageAutoreplyTemplate', 2, 'AffiliateFamilyName');
	setMailReplaceButton('ManageAutoreplyTemplate', 2, 'AffiliateGivenName');
	setMailReplaceButton('ManageAutoreplyTemplate', 2, 'CenterName');
	setMailReplaceButton('ManageAutoreplyTemplate', 2, 'AffiliateLoginUrl');
	
	setMailReplaceButton('ManageAutoreplyTemplate', 3, 'AffiliateId');
	setMailReplaceButton('ManageAutoreplyTemplate', 3, 'AffiliateEmail');
	setMailReplaceButton('ManageAutoreplyTemplate', 3, 'AffiliateFamilyName');
	setMailReplaceButton('ManageAutoreplyTemplate', 3, 'AffiliateGivenName');
	setMailReplaceButton('ManageAutoreplyTemplate', 3, 'ReminderUrl');
	setMailReplaceButton('ManageAutoreplyTemplate', 3, 'CenterName');
	
	setMailReplaceButton('ManageAutoreplyTemplate', 9, 'AffiliateId');
	setMailReplaceButton('ManageAutoreplyTemplate', 9, 'AffiliateEmail');
	setMailReplaceButton('ManageAutoreplyTemplate', 9, 'AffiliateFamilyName');
	setMailReplaceButton('ManageAutoreplyTemplate', 9, 'AffiliateGivenName');
	setMailReplaceButton('ManageAutoreplyTemplate', 9, 'CenterName');
	setMailReplaceButton('ManageAutoreplyTemplate', 9, 'AdminAddress');
	
	setMailReplaceButton('ManageAutoreplyTemplate', 10, 'AffiliateId');
	setMailReplaceButton('ManageAutoreplyTemplate', 10, 'AffiliateEmail');
	setMailReplaceButton('ManageAutoreplyTemplate', 10, 'AffiliateFamilyName');
	setMailReplaceButton('ManageAutoreplyTemplate', 10, 'AffiliateGivenName');
	setMailReplaceButton('ManageAutoreplyTemplate', 10, 'CenterName');
	setMailReplaceButton('ManageAutoreplyTemplate', 10, 'AdminAddress');
}

function setManageProuctMailReplaces(){
	setMailReplaceButton('ManageProductMail', 4, 'ContractId');
	setMailReplaceButton('ManageProductMail', 4, 'ContractEmail');
	setMailReplaceButton('ManageProductMail', 4, 'ContractFamilyName');
	setMailReplaceButton('ManageProductMail', 4, 'ContractGivenName');
	setMailReplaceButton('ManageProductMail', 4, 'ContractDate');
	setMailReplaceButton('ManageProductMail', 4, 'OptinUrl');
	setMailReplaceButton('ManageProductMail', 4, 'ProductId');
	setMailReplaceButton('ManageProductMail', 4, 'ProductTitle');
	setMailReplaceButton('ManageProductMail', 4, 'ProductGroupId');
	setMailReplaceButton('ManageProductMail', 4, 'ProductGroupTitle');
	setMailReplaceButton('ManageProductMail', 4, 'CenterName');
	
	setMailReplaceButton('ManageProductMail', 5, 'ContractId');
	setMailReplaceButton('ManageProductMail', 5, 'ContractEmail');
	setMailReplaceButton('ManageProductMail', 5, 'ContractFamilyName');
	setMailReplaceButton('ManageProductMail', 5, 'ContractGivenName');
	setMailReplaceButton('ManageProductMail', 5, 'ContractDate');
	setMailReplaceButton('ManageProductMail', 5, 'ProductId');
	setMailReplaceButton('ManageProductMail', 5, 'ProductTitle');
	setMailReplaceButton('ManageProductMail', 5, 'ProductGroupId');
	setMailReplaceButton('ManageProductMail', 5, 'ProductGroupTitle');
	setMailReplaceButton('ManageProductMail', 5, 'CenterName');
	setMailReplaceButton('ManageProductMail', 5, 'AffiliateId');
	setMailReplaceButton('ManageProductMail', 5, 'AffiliateFamilyName');
	setMailReplaceButton('ManageProductMail', 5, 'AffiliateGivenName');
	
	setMailReplaceButton('ManageProductMail', 6, 'ContractId');
	setMailReplaceButton('ManageProductMail', 6, 'ContractDate');
	setMailReplaceButton('ManageProductMail', 6, 'AffiliateId');
	setMailReplaceButton('ManageProductMail', 6, 'AffiliateEmail');
	setMailReplaceButton('ManageProductMail', 6, 'AffiliateFamilyName');
	setMailReplaceButton('ManageProductMail', 6, 'AffiliateGivenName');
	setMailReplaceButton('ManageProductMail', 6, 'ProductId');
	setMailReplaceButton('ManageProductMail', 6, 'ProductTitle');
	setMailReplaceButton('ManageProductMail', 6, 'ProductGroupId');
	setMailReplaceButton('ManageProductMail', 6, 'ProductGroupTitle');
	setMailReplaceButton('ManageProductMail', 6, 'CenterName');
	setMailReplaceButton('ManageProductMail', 6, 'AffiliateLoginUrl');
	setMailReplaceButton('ManageProductMail', 6, 'AffiliateRemindUrl');
	
	setMailReplaceButton('ManageProductMail', 7, 'ContractId');
	setMailReplaceButton('ManageProductMail', 7, 'ContractEmail');
	setMailReplaceButton('ManageProductMail', 7, 'ContractFamilyName');
	setMailReplaceButton('ManageProductMail', 7, 'ContractGivenName');
	setMailReplaceButton('ManageProductMail', 7, 'ContractDate');
	setMailReplaceButton('ManageProductMail', 7, 'ProductId');
	setMailReplaceButton('ManageProductMail', 7, 'ProductTitle');
	setMailReplaceButton('ManageProductMail', 7, 'ProductGroupId');
	setMailReplaceButton('ManageProductMail', 7, 'ProductGroupTitle');
	setMailReplaceButton('ManageProductMail', 7, 'CenterName');
	
	setMailReplaceButton('ManageProductMail', 8, 'ContractId');
	setMailReplaceButton('ManageProductMail', 8, 'ContractEmail');
	setMailReplaceButton('ManageProductMail', 8, 'ContractFamilyName');
	setMailReplaceButton('ManageProductMail', 8, 'ContractGivenName');
	setMailReplaceButton('ManageProductMail', 8, 'ContractDate');
	setMailReplaceButton('ManageProductMail', 8, 'ProductId');
	setMailReplaceButton('ManageProductMail', 8, 'ProductTitle');
	setMailReplaceButton('ManageProductMail', 8, 'ProductGroupId');
	setMailReplaceButton('ManageProductMail', 8, 'ProductGroupTitle');
	setMailReplaceButton('ManageProductMail', 8, 'CenterName');
	setMailReplaceButton('ManageProductMail', 8, 'AffiliateId');
	setMailReplaceButton('ManageProductMail', 8, 'AffiliateFamilyName');
	setMailReplaceButton('ManageProductMail', 8, 'AffiliateGivenName');
	
	setMailReplaceButton('ManageProductMail', 12, 'ContractId');
	setMailReplaceButton('ManageProductMail', 12, 'ContractEmail');
	setMailReplaceButton('ManageProductMail', 12, 'ContractFamilyName');
	setMailReplaceButton('ManageProductMail', 12, 'ContractGivenName');
	setMailReplaceButton('ManageProductMail', 12, 'ContractDate');
	setMailReplaceButton('ManageProductMail', 12, 'ProductId');
	setMailReplaceButton('ManageProductMail', 12, 'ProductTitle');
	setMailReplaceButton('ManageProductMail', 12, 'ProductGroupId');
	setMailReplaceButton('ManageProductMail', 12, 'ProductGroupTitle');
	setMailReplaceButton('ManageProductMail', 12, 'CenterName');
	setMailReplaceButton('ManageProductMail', 12, 'ContractDetailId');
	setMailReplaceButton('ManageProductMail', 12, 'ContractDetailCount');
	setMailReplaceButton('ManageProductMail', 12, 'ContractDetailPrice');
	setMailReplaceButton('ManageProductMail', 12, 'ContractDetailPaymentDate');
	setMailReplaceButton('ManageProductMail', 12, 'NextPaymentDueDate');
}

function setManageMailReplaces(){
	setMailReplaceButtonForMails('ManageMail', 'Id');
	setMailReplaceButtonForMails('ManageMail', 'Email');
	setMailReplaceButtonForMails('ManageMail', 'FamilyName');
	setMailReplaceButtonForMails('ManageMail', 'GivenName');
	setMailReplaceButtonForMails('ManageMail', 'AffiliTag');
	setMailReplaceButtonForMails('ManageMail', 'CenterName');
	setMailReplaceButtonForMails('ManageMail', 'AffiliateLoginUrl');
	setMailReplaceButtonForMails('ManageMail', 'AffiliateRemindUrl');
	setMailReplaceButtonForMails('ManageMail', 'StopMailUrl');
}


function addProductLpForms(){
	var max_count = 250;
	var id = null;
	for(var i=1; i< (max_count+10); i++){
		if($('.lp_form_' + i).size() <= 0){
			id = i;
			break;
		}
	}
	if(id == null){
		return false;
	}
	if(id > max_count){
		alert('設定できるLPは' + max_count + '個までとなっております');
		return false;
	}
	
	$('#lp_table').append('\
			<tr class="lp_form_' + id + '">\
					<th rowspan="4">\
						新規追加\
						<input type="hidden" name="data[ManageProductLp][' + id + '][count]" value="' + id + '">\
					</th>\
					<th rowspan="2">PC</th>\
					<th>LP</th>\
					<td>\
						<div class="input text">\
							<input name="data[ManageProductLp][' + id + '][pc_lp_url]" class="box100par" type="text">\
						</div>\
					</td>\
					<td rowspan="4">\
						<input type="hidden" name="data[ManageProductLp][' + id + '][affiliate_apply_status]" value="0">\
						<input type="checkbox" name="data[ManageProductLp][' + id + '][affiliate_apply_status]" label="公開" value="1" checked="checked">\
					</td>\
					<td rowspan="4">\
						<span class="button red" onClick="deleteProductLpForms(\'lp_form_' + id + '\')">取消</span>\
					</td>\
			</tr>\
			<tr class="lp_form_' + id + '">\
					<th>サンキュー</th>\
					<td>\
						<div class="input text">\
							<input name="data[ManageProductLp][' + id + '][pc_thankyou_url]" class="box100par" type="text">\
						</div>\
					</td>\
			</tr>\
			<tr class="lp_form_' + id + '">\
					<th rowspan="2">スマフォ</th>\
					<th>LP</th>\
					<td>\
						<div class="input text">\
							<input name="data[ManageProductLp][' + id + '][sp_lp_url]" class="box100par" type="text">\
						</div>\
					</td>\
			</tr>\
			<tr class="lp_form_' + id + '">\
					<th>サンキュー</th>\
					<td>\
						<div class="input text">\
							<input name="data[ManageProductLp][' + id + '][sp_thankyou_url]" class="box100par" type="text">\
						</div>\
					</td>\
			</tr>\
	');
}

function deleteProductLpForms($name){
	$('.' + $name).remove();
}

function addProductContentForms(){
	var max_count = 10;
	var id = null;
	for(var i=1; i< (max_count+10); i++){
		if($('.content_form_' + i).size() <= 0){
			id = i;
			break;
		}
	}
	if(id == null){
		return false;
	}
	if(id > max_count){
		alert('設定できる効果測定は' + max_count + '個までとなっております');
		return false;
	}
	
	$('#content_table').append('\
			</th>\
			<tr class="content_form_' + id + '">\
				<th>\
					効果測定No' + i + '\
					<input type="hidden" name="data[ManageProductContent][' + id + '][count]" value="' + id + '" id="ManageProductContent' + id + 'Count" />\
				</th>\
				<td>\
					<div class="input text required"><input name="data[ManageProductContent][' + id + '][key]" class="box100par content_form_keys" type="text" value="" id="ManageProductContent' + id + 'Key" required="required" data-count="' + id + '"/></div>\
				</td>\
				<td>\
					<div class="input text required"><input name="data[ManageProductContent][' + id + '][redirect_url]" class="box100par" type="text" value="" id="ManageProductContent' + id + 'RedirectUrl" required="required"/></div>\
				</td>\
				<td>\
					<input type="text" readonly="readonly" value="" class="box100par" id="content_form_url_' + id + '" onmouseover="this.select()">\
				</td>\
			</tr>\
		</tr>\
	');
}

function setManageProuctContent(){
	$(document).on('keyup', '.content_form_keys', function(){
		var key = $(this).val();
		var count = $(this).attr('data-count');
		var center_domain = $('#center_domain').val();
		var product_id = $('#product_id').val();
		if(product_id == ''){
			product_id = '案件ID未確定';
		}
		var content_url = "http://" + center_domain + '/contents/' + product_id + '/' + key + '/成約ID/';
		$('#content_form_url_' + count).val(content_url);
	});
	$('.content_form_keys').trigger('keyup');
}



	function AjaxGetAffiliatesList() {
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "api/getAffiliatesList",
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			generateAffiliatesList(data);
		},
		error : function(e) {
		},
		done : function(e) {
		}
	});
}							
	
	function AjaxGetAffiliatesRank() {
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "api/util/getRankList",
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			var dataToAppend = "<option value='-1'><全部></option>";
			$.each(data, function(i, item){
				
				dataToAppend += "<option value='" + item.itemID + "'>" + item.itemName + "</option>";
			});
			$( "#ManageAffiliateAffiliateRankId" ).append(dataToAppend);
			$("#ManageAffiliateAffiliateRankId").val(-1);
		},
		error : function(e) {
		},
		done : function(e) {
		}
	});
}
	
	function AjaxGetAffiliatesStatus() {
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "api/util/getStatusList",
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			var dataToAppend = "<option value='-1'><全部></option>";
			$.each(data, function(i, item){
				
				dataToAppend += "<option value='" + item.itemID + "'>" + item.itemName + "</option>";
			});
			$( "#ManageAffiliateStatus" ).append(dataToAppend);
			$("#ManageAffiliateStatus").val(-1);
		},
		error : function(e) {
		},
		done : function(e) {
		}
	});
}
	
	function AjaxGetAffiliatesPermit() {
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "api/util/getMailStatusList",
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			var dataToAppend = "<option value='-1'><全部></option>";
			$.each(data, function(i, item){
				
				dataToAppend += "<option value='" + item.itemID + "'>" + item.itemName + "</option>";
			});
			$( "#ManageAffiliateMailDeliveryPermit" ).append(dataToAppend);
			$("#ManageAffiliateMailDeliveryPermit").val(-1);
		},
		error : function(e) {
		},
		done : function(e) {
		}
	});
}
	
function searchAffiliatesViaAjax(command) {
	var search = {}
	search["affiliatesId"] = $('#ManageAffiliateIdSearch').val();
	search["lastName"] = $('#ManageAffiliateFamilyName').val();
	search["firstName"] = $('#ManageAffiliateGivenName').val();
	search["email"] = $('#ManageAffiliateUsername').val();
	search["ip"] = $('#ManageAffiliateIpaddress').val();
	search["dateFrom"] = $('#ManageAffiliateCreatedFrom').val();
	search["dateTo"] = $('#ManageAffiliateCreatedTo').val();
	
	if(command == 2){
	search["rank"] = parseInt($('#ManageAffiliateAffiliateRankId').val());
	search["status"] = parseInt($('#ManageAffiliateStatus').val());
	search["permit"] = $('#ManageAffiliateMailDeliveryPermit').val();
	}else{
		search["rank"] = -1;
		search["status"] = -1;
		search["permit"] = -1;
	}
	
	search["earn"] = $('#ManageAffiliateEarn').val();
	search["mailNumber"] = $('#ManageAffiliateSellNum').val();
	
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "api/search",
		data : JSON.stringify(search),
		dataType : 'json',
		timeout : 100000,
		success : function(data) {	
		
		if(command == 2){
			$('#tableData').paging('destroy');
			$('.paging-nav').remove();
			$('#dataTableBody').empty();		
			$("#RecNum").empty();
			
/*			if($('#ManageAffiliateCreatedFrom').val() != 0 && $('#ManageAffiliateCreatedTo').val() != 0){
				if(validateDate('#ManageAffiliateCreatedFrom') && validateDate('#ManageAffiliateCreatedTo')){
					generateAffiliatesList(data);
				}
			}else if($('#ManageAffiliateCreatedFrom').val() == 0 && $('#ManageAffiliateCreatedTo').val() != 0 ){
				if(validateDate('#ManageAffiliateCreatedTo')){
					generateAffiliatesList(data);
				}
			}else if($('#ManageAffiliateCreatedFrom').val() != 0 && ($('#ManageAffiliateCreatedTo').val()) == 0 ){
				if(validateDate('#ManageAffiliateCreatedFrom')){
					generateAffiliatesList(data);
				}
			}else{
				generateAffiliatesList(data);
			}*/
			
		}
		
		generateAffiliatesList(data);

		},
		error : function(e) {
			console.log("ERROR: ", e);
			alert("error");
			//display(e);
		},
		done : function(e) {
			console.log("DONE");
			alert("done");
			//enableSearchButton(true);
		}
	});
}

function validateDate(date) {
    var date_regex = /[1-3][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9] [0-9][0-9]:[0-9][0-9]:[0-9][0-9]/;
    if(!date_regex.test(date)){
        alert("日時のフォーマットは不正");
        return false;
    }
    return true;
	}

function fieldBlankSetErrorValidation(element, msg){
    if( $.trim($(element).val()) == 0 ) {
    	if(!$(element).parent().hasClass( "error" )){
    	$(element).after( "<div class='error-message'>" + msg + "</div>" );
    	$(element).parent().addClass( "error" );
    	$(element).focus();
    	}
    	return false;
    }else{
    	$(element).parent().removeClass( "error" );
    	$(element).next().remove();
    	//$( ".error-message" ).remove();
    	return true;
    }
}

    function fieldSetErrorValidation(action, element, msg){
        if( action == 1 ) {
        	$(element).after( "<div class='error-message'>" + msg + "</div>" );
        	$(element).parent().addClass( "error" );
        	$(element).focus();
        }else{
        	$(element).next().remove();
        	$(element).parent().removeClass( "error" );
        	//$( ".error-message" ).remove();
        }
    }




