$(function(){
	
	if($('#SearchSelectProductGroups').size() > 0){
		setSearchSelectProductGroups();
		setSearchSelectDeviceTypes();
		
		$('#SearchSelectProductGroups').change(function(){
			setSearchSelectProducts();
		});
		
		$('#SearchSelectProducts').change(function(){
			setSearchSelectProductLps();
		});
	}

});

function setSearchSelectProductGroups(){
	
	//各項目の内容を削除
	resetOptions('#SearchSelectProductGroups');
	resetOptions('#SearchSelectProducts');
	resetLpOptions('#SearchSelectProductLps');
	
	$.getJSON("/manage/products/ajax_product_groups", function(json){
		//取得したデータを案件グループに設定
		$.each(json, function(i, val) {
			$('#SearchSelectProductGroups').append($('<option>').html(val).val(i));
		});
		
		$("#SearchSelectProductGroups").val(getParam('product_group_id')).trigger('change');
	});
}

function setSearchSelectProducts(){
	
	//各項目の内容を削除
	resetOptions('#SearchSelectProducts');
	resetLpOptions('#SearchSelectProductLps');
	resetOptions('.SearchSelectProducts');
	
	var product_group_id = $('#SearchSelectProductGroups').val();
	if(product_group_id == ''){
		return;
	}
	
	$.getJSON("/manage/products/ajax_products/" + product_group_id, function(json){
		$.each(json, function(i, val) {
			$('#SearchSelectProducts').append($('<option>').html(val).val(i));
			$('.SearchSelectProducts').append($('<option>').html(val).val(i));
		});
		
		if(getParam('product_group_id') == product_group_id){
			$("#SearchSelectProducts").val(getParam('product_id')).trigger('change');
			
			//複数選択用(analyses)
			for(var i=0; i<5; i++){
				var tmp_product_id = getParam('product_id%5B' + i + '%5D');
				if(tmp_product_id){
					$('#SearchSelectProduct' + i).val(tmp_product_id).trigger('change');
				}
			}
		}
	});
}

function setSearchSelectProductLps(){
	
	//各項目の内容を削除
	resetLpOptions('#SearchSelectProductLps');
	
	var product_id = $('#SearchSelectProducts').val();
	if(product_id == ''){
		return;
	}
	
	$.getJSON("/manage/products/ajax_product_lps/" + product_id, function(json){
		$.each(json, function(i, val) {
			$('#SearchSelectProductLps').append($('<option>').html(val).val(i));
		});
		
		if(getParam('product_id') == product_id){
			$("#SearchSelectProductLps").val(getParam('product_lp_id'));
		}
		
	});
}

function setSearchSelectDeviceTypes(){
	//各項目の内容を削除
	resetOptions('#SearchSelectDeviceTypes > option');
	
	$.getJSON("/manage/products/ajax_device_types/", function(json){
		$.each(json, function(i, val) {
			$('#SearchSelectDeviceTypes').append($('<option>').html(val).val(i));
		});
		$("#SearchSelectDeviceTypes").val(getParam('device_type'));
	});
}

function getParam(name){
	var res = location.href.match(new RegExp( name + ':([^\/]+)'));
	if(res != null && 1 in res){
		return res[1];
	}else{
		return $('#selected_' + name).val();
	}
}

function resetOptions(id){
	$(id + ' > option').remove();
	$(id).append($('<option>').html('').val(''));
}

function resetLpOptions(id){
	$(id + ' > option').remove();
	if($('#SearchSelectProductLpLabelRandom').val() == '1'){
		$(id).append($('<option>').html('ランダム表示').val(''));
	}else{
		$(id).append($('<option>').html('').val(''));
	}
}