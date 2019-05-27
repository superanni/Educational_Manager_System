$(window).load(function(){	

	/* ������������Զ�����:	*/
	$(".contentslider-std").sliderkit({
		auto:0,
		tabs:1,
		circular:1,
		panelfx:"sliding",
		panelfxfirst:"fading",
		panelfxeasing:"easeInOutExpo",
		fastchange:'true',
		keyboard:1, 
		panelfxafter: function(){
			populate_preview_images(slider_ids);
		}
	});


	var slider_ids = [];
	var description_ids = [];
	var description = $('.description');// �����������Ǹı䲻ͬ������
	var slider_frame = $('.sliderkit-panels li');

	element_push(slider_frame, slider_ids);	
	element_push_desc(slider_frame, description_ids);	
	
	/* ����������ť */
	$('.contentslider-std .sliderkit-go-prev').animate({left:0},800);
	$('.contentslider-std .sliderkit-go-next').animate({right:0},800);
	$('.contentslider-std .sliderkit-go-btn').hover(function(){
		$(this).css('background-color','#ffc62b')
	},function(){
	});
	
	$('.sliderkit-go-next a').addClass('next');
	$('.sliderkit-go-prev a').addClass('prev');
	$('.sliderkit-go-next a').append('<strong>&nbsp;</strong>');
	$('.sliderkit-go-prev a').append('<strong>&nbsp;</strong>');

	/* ����Ԥ��ͼ�� */
	$('.sliderkit-go-next').hover(function (){
		$('.sliderkit-go-next a.next strong').stop(true, false).animate({
			opacity: 1,
		}, 800, function(){});
	},function (){
		$('.sliderkit-go-next a.next strong').stop(true, false).animate({
			opacity: 0,
		}, 800, function(){
			$('.sliderkit-go-next ').css('background-color','#F24A4A')
		});
	});
	
	$('.sliderkit-go-prev').hover(function (){
		$('.sliderkit-go-prev a.prev strong').stop(true, false).animate({
			opacity: 1,
			}, 800, function(){
		});
	},
	function (){
		$('.sliderkit-go-prev a.prev strong').stop(true, false).animate({opacity: 0}, 800, function(){
			$('.sliderkit-go-prev ').css('background-color','#F24A4A');
		});
	});
	
	/* Ԥ��ͼ�����ҳ����غ� */
	populate_preview_images(slider_ids);

	/* ���ĵ�����,����60%��div��������ڵĿ��  */
	var window_w = parseInt($(window).width());
	var desc_w = parseInt($(window).width())*0.6;/* �����������Ϊ60%�Ĵ��ڿ�� */
	$('.description').css('width' , desc_w + 'px');
	$('.description').center();
	/* ��ȵļ��������������ڴ��ڵ�����С */
	$(window).resize(function(){
		var desc_w = parseInt($(window).width())*0.6;
		var window_w = parseInt($(window).width());
		$('.description').css('width' , desc_w + 'px');
		$('.sliderkit-panels li').css('width' , window_w + 'px');
		$('.description').center();
	});	

	$('.sliderkit-go-next').click(function(){
		slider_ids.push(slider_ids.shift());
		description_ids.push(description_ids.shift());
		return false;
	});
	
	$('.sliderkit-go-prev ').click(function(){
		slider_ids.unshift(slider_ids.pop());
		description_ids.unshift(description_ids.pop());
		return false
	});

});

/*************** functions ****************/


/* ���Ԥ��ͼ�� */
function populate_preview_images(sliders){
	var prev = $("#" + sliders[sliders.length-1]);
	$('.sliderkit-go-prev strong').attr('id', sliders[sliders.length-1] + '-thumb');
	$('.sliderkit-go-next strong').attr('id', sliders[1] + '-thumb');
}

/* ��������Ԫ�� $('Ԫ��,���뼯��').center();*/
jQuery.fn.center = function(loaded){
	var objs = this;
	body_width = parseInt($(window).width());
	objs.each(function(){
		var obj = $(this)
		var block_width = parseInt(obj.width());
		var left_position = parseInt((body_width/2) - (block_width/2)  + $(window).scrollLeft());
		if (body_width < block_width) { left_position = 0 };
		if(!loaded){
			obj.css({'position': 'absolute'});
			obj.css({'left': left_position});
			obj.center(!loaded);
			$(window).bind('resize', function() { 
				obj.center(!loaded);
			});
			$(window).bind('scroll', function() { 
				obj.center(!loaded);
			});
		}else{
			obj.stop();
			obj.css({'position': 'absolute'});
			obj.animate({'left': left_position}, 200, 'linear');
		}
	});
}

/* Ԫ���ƶ� */
function element_push(x,y){
	$(x).each(function(){
		y.push($(this).attr('id'));
	})
}
function element_push_desc(x,y){
	$(x).each(function(){
		y.push($(this).find('.description').attr('id'));
	})
}