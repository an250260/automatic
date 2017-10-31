/*
 * JavaScript Pretty Date
 * Copyright (c) 2011 John Resig (ejohn.org)
 * Licensed under the MIT and GPL licenses.
 * (を元に改造)
 */

// Takes an ISO time and returns a string representing how
// long ago the date represents.
function prettyDate(time){
	var date = new Date((time || "").replace(/-/g,"/").replace(/[TZ]/g," ")),
		diff = (((new Date()).getTime() - date.getTime()) / 1000),
		day_diff = (diff / 86400) > 0 ? Math.floor(diff / 86400) : Math.ceil(diff / 86400);

	if ( isNaN(day_diff) || day_diff >= 31 || day_diff <= -31 )
		return '';
	
	return day_diff == 0 && (
			diff < -3600 && "約 " + Math.floor( diff / -3600 ) + " 時間後" ||
			diff < -60 && "約 " + Math.floor( diff / -60 ) + " 分後" ||
			diff < 60 && "1 分以内" ||
			diff < 3600 && "約 " + Math.floor( diff / 60 ) + " 分前" ||
			diff < 86400 && "約 " + Math.floor( diff / 3600 ) + " 時間前"
			) ||
		day_diff < -7 && "約 " + Math.floor( day_diff / -7 ) + " 週間後" ||
		day_diff < -1 && "約 " + (-day_diff) + " 日後" ||
		day_diff == -1 && "明日" ||
		day_diff == 1 && "昨日" ||
		day_diff < 7 && "約 " + day_diff + " 日前" ||
		day_diff < 31 && "約 " + Math.ceil( day_diff / 7 ) + " 週間前";
}

// If jQuery is included in the page, adds a jQuery plugin to handle it as well
if ( typeof jQuery != "undefined" ){
	jQuery.fn.prettyDate = function(){
		return this.each(function(){
			var date = prettyDate(this.title);
			if ( date )
				jQuery(this).text( date );
		});
	};
}