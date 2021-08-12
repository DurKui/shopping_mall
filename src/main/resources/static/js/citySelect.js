/**
 * Created by mzf on 2018/8/7.
 */
$(function(){
    addArray();
    //console.log(arr2);
    //加载省级列表
    for(let i=0;i<arr.length;i++) {
        $('.dropProvUl').append("<li class='dropProvLi'>" + arr[i] + "</li>");
    }
    //点击选择城市时，先隐藏省级市级选择块
    $('.citySelect').on('click',function(){
        //$('.dropDown').toggle();
        $('.dropCity').css('display',"none");
        $('.dropProv').toggle();
            //点击省份时，自动选择省会城市
            $('.dropProvLi').on('click',function(){
                $('.cityName').text( arr2[$(this).index()][0]);
                $('.dropDown div').css("display","none");
            });
            //给省级列表添加mouseover事件
            $('.dropProvLi').on('mouseover',function(){
                $('.dropCity').css("display","block");
                $('.dropProvLi').css("background-color","white");
                $('.dropCityUl').empty();
                $(this).css("background-color","#f1f3f6");
                //加载城市列表
                for(let j=0;j<arr2[$(this).index()].length;j++){
                    $('.dropCityUl').append("<li class='dropCityLi'>"+arr2[$(this).index()][j]+"</li>");

                }
                //选择城市
                $('.dropCityLi').on("click", function () {
                    //console.log($(this).text());
                    $('.cityName').text($(this).text());
                    $('.dropDown div').css("display","none");
                });
            });
    });
   // console.log(arr[17]);
});
//把市级添加到arr2中对应的省级
function addArray(){
     arr=["1号线","2号线","3号线","4号线","5号线","10号线","11号线","12号线"];
    //  arr2=["北京","天津","上海","重庆","河北","山西","内蒙古","辽宁","吉林","黑龙江","江苏","浙江","安徽","福建","江西","山东","河南","湖北","湖南","广东","广西","海南","四川","贵州","云南","西藏","陕西","甘肃","青海","宁夏","新疆","香港","澳门","台湾"];
    arr2=["1号线","2号线","3号线","4号线","5号线","10号线","11号线","12号线"];
    function addTo(id,iArray){
        arr2[id] = [];
        for(let i=0;i<iArray.length;i++){
            arr2[id][i]=iArray[i];
        }

    }
    addTo("0",["Sta1","Sta159","Sta108","Sta83","Sta107","Sta154","Sta150","Sta64","Sta89","Sta80","Sta97","Sta110","Sta106","Sta34","Sta128","Sta74","Sta149","Sta49","Sta65","Sta104"]);
   addTo("1",["Sta9","Sta163","Sta53","Sta78","Sta79","Sta18","Sta123","Sta127","Sta81","Sta27","Sta81","Sta27","Sta48","Sta151","Sta68","Sta52","Sta76","Sta57","Sta71","Sta139","Sta24","Sta105","Sta51","Sta129","Sta47",]);
   addTo("2",["Sta143","Sta156","Sta61","Sta50","Sta119","Sta66","Sta12","Sta161","Sta21","Sta133","Sta22","Sta138","Sta41","Sta30","Sta67","Sta144","Sta29","Sta126","Sta40","Sta131","Sta39","Sta100","Sta167","Sta113","Sta141","Sta142","Sta158","Sta44","Sta117","Sta147","Sta42","Sta35","Sta109","Sta33","Sta112","Sta153","Sta125","Sta121","Sta5","Sta98","Sta155"]);
   addTo("3",["Sta59","Sta19","Sta62","Sta165","Sta58","Sta38","Sta84"]);
   addTo("4",["Sta43","Sta10","Sta96","Sta132","Sta37","Sta16","Sta69","Sta54"]);
   // 11号线//
   addTo("6",["Sta120","Sta130","Sta146","Sta25","Sta3","Sta46","Sta86","Sta15","Sta162","Sta118","Sta20","Sta55","Sta70","Sta13","Sta140","Sta77","Sta122","Sta36","Sta166","Sta99","Sta124","Sta28","Sta82","Sta164","Sta152","Sta45","Sta23","Sta56","Sta115","Sta63","Sta111"]);
//    10号线
   addTo("5",["Sta134","Sta75","Sta157","Sta168","Sta85","Sta2","Sta4","Sta103","Sta145","Sta88","Sta94","Sta160","Sta7","Sta6","Sta8","Sta102","Sta114","Sta135","Sta87"]);
//    12号线
   addTo("7",["Sta136","Sta137","Sta101","Sta17","Sta26","Sta90","Sta95","Sta93","Sta92","Sta32","Sta31","Sta72","Sta116","Sta60","Sta148","Sta73","Sta14"]);
  
   // console.log(arr);
};

