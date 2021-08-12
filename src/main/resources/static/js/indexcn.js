$(function() {
    if($(window).width() > 1024) {
        var myswiper = new Swiper('.wrapperpc', {
            direction: 'vertical',
            mousewheel: true,
            hashNavigation: true,
            observer: true,
            noSwipingSelector: '.mask_bs',
            pagination: {
                el: '.span',
                clickable: true
            },
            on:{
              init: function(){
                swiperAnimateCache(this);
                swiperAnimate(this);
              }, 
              slideChangeTransitionEnd: function(){ 
                swiperAnimate(this);
              } 
            }
        })

        //section4我们的业务
        var myswiper4 = new Swiper('.section4_swiper', {
            slidesPerView: 7,
            loopAdditionalSlides: 5,
            centeredSlides: true,
            slideToClickedSlide: true,
            loop: true,
            pagination: {
                el: '.span1',
                dynamicBullets: true,
                clickable: true
            }
        })

        $('.toslide').click(function() {
            myswiper.slideTo(5)
            return false
        })


        $('.pc .section5_item .img').click(function() {
            var _this = $(this).parent().index()
            $('.nav_ico, .logo, .section5_wrapper, .header_right').addClass('filter')
            $('.mask').eq(_this).fadeIn()
            var bscroll = new BScroll($('.mask').eq(_this).find('.mask_bs').get(0), {
                scrollbar: {
                    fade: true,
                    interactive: true
                },
                mouseWheel: true
            })
        })

        $('.learnmore').click(function() {
            myswiper.slideTo(5)
            return false
        })

        $('.close').click(function() {
            $(this).parent().fadeOut(function() {
                $('.nav_ico, .logo, .section5_wrapper, .header_right').removeClass('filter')
            })
        })

        //导航
        var orpageshow = true
        $('.nav_ico').click(function() {
            if(orpageshow) {
                $('.page_container').animate({'left': -600})
                orpageshow = false
            }else {
                $('.page_container').animate({'left': 0})
                orpageshow = true
            }
            return false
        })

        $('.user, .swiper-container').click(function() {
            $('.page_container').animate({'left': 0})
        })

        $('.nav a').click(function(ev) {
            var _this = $(this).index()
            myswiper.slideTo(_this)
            $('.nav').removeClass('navshow')
        })

    }else {
        var myswiper = new Swiper('.wrapper', {
            direction: 'vertical',
            mousewheel: true,
            hashNavigation: true,
            observer: true,
            noSwipingSelector: '.mask_bs',
            on:{
              init: function(){
                swiperAnimateCache(this);
                swiperAnimate(this);
              }, 
              slideChangeTransitionEnd: function(){ 
                swiperAnimate(this);
              } 
            }
        })

        //section4我们的业务
        var myswiper4 = new Swiper('.section4_swiper', {
            slidesPerView: 3,
            loopAdditionalSlides: 3,
            centeredSlides: true,
            slideToClickedSlide: true,
            loop: true,
            pagination: {
                el: '.span1',
                dynamicBullets: true
            }
        })


        $('.wap .section5_item .img').click(function() {
            var _this = $(this).parent().index()
            $('.nav_ico, .logo, .section5_wrapper, .header_right').addClass('filter')
            $('.wap .mask').eq(_this).fadeIn()
            var bscroll = new BScroll($('.wap .mask').eq(_this).find('.mask_bs').get(0), {
                scrollbar: {
                    fade: true,
                    interactive: true
                },
                mouseWheel: true
            })
        })

        $('.learnmore').click(function() {
            myswiper.slideTo(5)
            return false
        })

        $('.close').click(function() {
            $(this).parent().fadeOut(function() {
                $('.nav_ico, .logo, .section5_wrapper, .header_right').removeClass('filter')
            })
        })

        //导航
        $('.nav_ico').click(function() {
            if(!$('.nav').hasClass('navshow')) {
                $('.nav').addClass('navshow')
            }else {
                $('.nav').removeClass('navshow')
            }
            
        })

        $('.nav a').click(function(ev) {
            var _this = $(this).index()
            myswiper.slideTo(_this)
            $('.nav').removeClass('navshow')
        })


    }
})

$(function() {
    $('.lang_btn').click(function(){
        $(this).find('.link').slideToggle(0) 
    })  
})