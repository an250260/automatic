$(function(){
    $(window).load(function(){
        $('input[type=text],input[type=password],textarea').each(function(){
            var thisTitle = $(this).attr('title');
            if(typeof thisTitle !== 'undefined' && !(thisTitle === '')){
                $(this).wrapAll('<span style="text-align:left;position:relative;"></span>');
                $(this).parent('span').append('<span class="placeholder">' + thisTitle + '</span>');
                
                var css = {
                    top:'-3px',
                    left:'10px',
                    fontSize:'120%',
                    textAlign:'left',
                    color:'#999',
                    overflow:'hidden',
                    position:'absolute',
                    zIndex:'99'
                };
                if (!$.support.noCloneChecked) {
                    css['top'] = '-18px';	//IEだけずれる対策
                }
                
                $('.placeholder').css(css).click(function(){
                    $(this).prev().focus();
                });
                $(this).focus(function(){
                    $(this).next('span').css({display:'none'});
                });
                $(this).blur(function(){
                    var thisVal = $(this).val();
                    if(thisVal === ''){
                        $(this).next('span').css({display:'inline-block'});
                    } else {
                        $(this).next('span').css({display:'none'});
                    }
                });
                var thisVal = $(this).val();
                if(thisVal === ''){
                    $(this).next('span').css({display:'inline-block'});
                } else {
                    $(this).next('span').css({display:'none'});
                }
            }
        });
    });
});
