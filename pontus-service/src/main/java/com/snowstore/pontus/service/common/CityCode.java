package com.snowstore.pontus.service.common;

import com.google.common.collect.BiMap;
import com.snowstore.pontus.service.common.util.Function;

public class CityCode {
	private static String code[] = new String[] { "3401", "3402", "3403", "3417", "3404", "3405", "3406", "3407", "3408", "3409", "3410", "3411", "3412", "3418", "3414", "3415", "3416", "1100", "1200", "5000", "3501", "3503", "3504", "3505", "3506", "3507", "3508", "3502",
			"3509", "4401", "4403", "4404", "4405", "4420", "4406", "4407", "4408", "4409", "4410", "4411", "4412", "4413", "4414", "4402", "4415", "4416", "4417", "4418", "4419", "4421", "4501", "4502", "4503", "4509", "4510", "4504", "4511", "4505", "4512", "4513", "4506",
			"4514", "4507", "4508", "5201", "5202", "5203", "5204", "5205", "5206", "5209", "5207", "5208", "6201", "6202", "6203", "6217", "6206", "6207", "6208", "6209", "6211", "6212", "6213", "6214", "6215", "6216", "4601", "4603", "4604", "4605", "4607", "4606", "4609",
			"4608", "4613", "4614", "4610", "4611", "4612", "4602", "4615", "4616", "4617", "4618", "4101", "4102", "4104", "4103", "4105", "4106", "4116", "4107", "4108", "4117", "4109", "4110", "4111", "4112", "4113", "4114", "4115", "2301", "2302", "2303", "2304", "2305",
			"2306", "2307", "2308", "2309", "2310", "2311", "2312", "2313", "4201", "4202", "4203", "4204", "4205", "4206", "4207", "4217", "4213", "4208", "4209", "4214", "4216", "4210", "4211", "4212", "4215", "4301", "4302", "4303", "4304", "4305", "4306", "4307", "4308",
			"4309", "4310", "4311", "4312", "4313", "4314", "1301", "1302", "1303", "1304", "1305", "1306", "1307", "1308", "1309", "1310", "1311", "3201", "3202", "3203", "3204", "3205", "3206", "3207", "3208", "3209", "3210", "3211", "3212", "3213", "3601", "3602", "3603",
			"3604", "3605", "3606", "3607", "3608", "3609", "3610", "3611", "2201", "2202", "2203", "2204", "2205", "2206", "2207", "2208", "2209", "2101", "2103", "2104", "2105", "2102", "2106", "2107", "2108", "2109", "2110", "2111", "2112", "2113", "2114", "6401", "6403",
			"6404", "6405", "6402", "1501", "1503", "1502", "1504", "1505", "1511", "1506", "1512", "1507", "1508", "1509", "1510", "6301", "6303", "6302", "6304", "6305", "6306", "6307", "6308", "3100", "3701", "3703", "3705", "3704", "3706", "3707", "3708", "3709", "3710",
			"3702", "3711", "3712", "3713", "3714", "3715", "3716", "3717", "1401", "1402", "1403", "1404", "1412", "1406", "1413", "1407", "1408", "1409", "1411", "6101", "6102", "6103", "6104", "6105", "6106", "6107", "6108", "6109", "6110", "5101", "5119", "5102", "5103",
			"5104", "5120", "5105", "5106", "5107", "5108", "5118", "5111", "5109", "5110", "5112", "5113", "5114", "5115", "5116", "5121", "5117", "5401", "5402", "5403", "5404", "5405", "5406", "5407", "6501", "6517", "6502", "6503", "6504", "6505", "6506", "6507", "6508",
			"6509", "6510", "6516", "6512", "6513", "6511", "6514", "6518", "6515", "5301", "5303", "5304", "5305", "5306", "5317", "5307", "5308", "5309", "5310", "5312", "5311", "5315", "5313", "5302", "5314", "3301", "3303", "3304", "3305", "3311", "3302", "3310", "3306",
			"3307", "3308", "3309", "9901", "9902", "9903" };

	private static String cityName[] = new String[] { "合肥", "安庆", "蚌埠", "亳州", "巢湖", "池州", "滁州", "阜阳", "淮北", "淮南", "黄山", "六安", "马鞍山", "宿州", "铜陵", "芜湖", "宣城", "北京", "天津", "重庆", "福州", "龙岩", "南平", "宁德", "莆田", "泉州", "三明", "厦门", "漳州", "广州", "潮州", "东莞", "佛山", "河源", "惠州", "江门", "揭阳",
			"茂名", "梅州", "清远", "汕头", "汕尾", "韶关", "深圳", "阳江", "云浮", "湛江", "肇庆", "中山", "珠海", "南宁", "百色", "北海", "崇左", "防城港", "桂林", "贵港", "河池", "贺州", "来宾", "柳州", "钦州", "梧州", "玉林", "贵阳", "安顺", "毕节地区", "六盘水", "铜仁地区", "遵义", "黔西南州", "黔东南州", "黔南州", "兰州", "白银", "定西", "甘南州", "嘉峪关", "金昌",
			"酒泉", "临夏州", "陇南", "平凉", "庆阳", "天水", "武威", "张掖", "海口", "白沙", "保亭", "昌江", "儋州", "澄迈", "东方", "定安", "琼海", "琼中", "乐东", "临高", "陵水", "三亚", "屯昌", "万宁", "文昌", "五指山", "郑州", "安阳", "鹤壁", "焦作", "开封", "洛阳", "漯河", "南阳", "平顶山", "濮阳", "三门峡", "商丘", "新乡", "信阳", "许昌", "周口", "驻马店",
			"哈尔滨", "大庆", "大兴安岭地区", "鹤岗", "黑河", "鸡西", "佳木斯", "牡丹江", "七台河", "齐齐哈尔", "双鸭山", "绥化", "伊春", "武汉", "鄂州", "恩施", "黄冈", "黄石", "荆门", "荆州", "潜江", "神农架林区", "十堰", "随州", "天门", "仙桃", "咸宁", "襄阳", "孝感", "宜昌", "长沙", "常德", "郴州", "衡阳", "怀化", "娄底", "邵阳", "湘潭", "湘西州", "益阳", "永州", "岳阳",
			"张家界", "株洲", "石家庄", "保定", "沧州", "承德", "邯郸", "衡水", "廊坊", "秦皇岛", "唐山", "邢台", "张家口", "南京", "常州", "淮安", "连云港", "南通", "苏州", "宿迁", "泰州", "无锡", "徐州", "盐城", "扬州", "镇江", "南昌", "抚州", "赣州", "吉安", "景德镇", "九江", "萍乡", "上饶", "新余", "宜春", "鹰潭", "长春", "白城", "白山", "吉林", "辽源", "四平",
			"松原", "通化", "延边", "沈阳", "鞍山", "本溪", "朝阳", "大连", "丹东", "抚顺", "阜新", "葫芦岛", "锦州", "辽阳", "盘锦", "铁岭", "营口", "银川", "固原", "石嘴山", "吴忠", "中卫", "呼和浩特", "阿拉善盟", "包头", "巴彦淖尔", "赤峰", "鄂尔多斯", "呼伦贝尔", "通辽", "乌海", "乌兰察布", "锡林郭勒盟", "兴安盟", "西宁", "果洛州", "海东地区", "海北州", "海南州", "海西州",
			"黄南州", "玉树州", "上海", "济南", "滨州", "东营", "德州", "菏泽", "济宁", "莱芜", "聊城", "临沂", "青岛", "日照", "泰安", "威海", "潍坊", "烟台", "枣庄", "淄博", "太原", "长治", "大同", "晋城", "晋中", "临汾", "吕梁", "朔州", "忻州", "阳泉", "运城", "西安", "安康", "宝鸡", "汉中", "商洛", "铜川", "渭南", "咸阳", "延安", "榆林", "成都", "阿坝州", "巴中",
			"达州", "德阳", "甘孜州", "广安", "广元", "乐山", "凉山州", "泸州", "南充", "眉山", "绵阳", "内江", "攀枝花", "遂宁", "雅安", "宜宾", "资阳", "自贡", "拉萨", "阿里地区", "昌都地区", "林芝地区", "那曲地区", "日喀则地区", "山南地区", "乌鲁木齐", "阿拉尔", "阿克苏地区", "阿勒泰地区", "巴音郭楞", "博尔塔拉州", "昌吉州", "哈密地区", "和田地区", "喀什地区", "克拉玛依", "克孜勒苏",
			"石河子", "塔城地区", "图木舒克", "吐鲁番地区", "五家渠", "伊犁州", "昆明", "保山", "楚雄州", "大理州", "德宏州", "迪庆州", "红河州", "丽江", "临沧", "怒江州", "普洱", "曲靖", "昭通", "文山", "西双版纳", "玉溪", "杭州", "湖州", "嘉兴", "金华", "丽水", "宁波", "衢州", "绍兴", "台州", "温州", "舟山", "香港", "澳门", "台湾" };

	private static String codeSpec[] = new String[] { "3100", "1100", "5000", "1200", "9901", "9902", "9903" };

	private static String cityNameSpec[] = new String[] { "上海", "北京", "重庆", "天津", "香港", "澳门", "台湾"

	};

	private static BiMap<String, String> cityCodeMap;

	/**
	 * 城市代码
	 */
	public static String getCode(String str, String provice) {
		boolean flag = false;
		for (int i = 0; i < cityNameSpec.length; i++) {
			if (provice.equals(cityNameSpec[i])) {
				flag = true;
				break;
			}
		}
		if (flag) {
			return getAllCode(provice, codeSpec, cityNameSpec);
		} else {
			return getAllCode(str, code, cityName);
		}
	}

	/**
	 * 通过省份代码码获取省份名称或通过省份名称获取省份代码
	 */
	public static String getAllCode(String str, String[] code, String[] cityName) {
		cityCodeMap = Function.map(code, cityName);
		if (str.matches("\\d+")) {
			return cityCodeMap.get(str); // 返回银行名称
		} else {
			return cityCodeMap.inverse().get(str); // 返回银行编码
		}
	}

}