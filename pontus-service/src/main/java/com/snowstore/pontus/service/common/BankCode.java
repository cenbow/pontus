package com.snowstore.pontus.service.common;

import com.google.common.collect.BiMap;
import com.snowstore.pontus.service.common.util.Function;

/**
 * 
 * @author: XiaoLei CHENG
 * @date:Aug 28, 2014
 * @time:16:10:23 PM
 * @version: 1.0
 * @describe 金鹿银行代码
 */
public class BankCode {

	/**
	 * 银行编码
	 */
	private static String[] code = { "00080003", "00080004", "00080001", "00080005", "00080006", "00080002", "00080009", "00080011", "00080013", "00080014", "00080016", "00080008", "00080012", "00080015", "00080020", "00080233", "00080242", "00080238", "00080053", "00080218",
			"00080049", "00080243", "00080217", "00080025", "00080205", "00080219", "00080190", "00080194", "00080252", "00080022", "00080203", "00080198", "00080222", "00080227", "00080250", "00080192", "00080245", "00080234", "00080196", "00080209", "00080215", "00080101",
			"00080054", "00080199", "00080171", "00080212", "00080033", "00080065", "00080165", "00080226", "00080229", "00080197", "00080193", "00080187", "00080231", "00080206", "00080207", "00080228", "00080230", "00080157", "00080204", "00080085", "00080080", "00080253",
			"00080200", "00080201", "00080037", "00080188", "00080088", "00080225", "00080210", "00080251", "00080221", "00080249", "00080070", "00080071", "00080247", "00080191", "00080214", "00080220", "00080232", "00080223", "00080090", "00080039", "00080077", "00080236",
			"00080160", "00080047", "00080213", "00080224", "00080216", "00080241", "00080248", "00080246", "00080244", "00080237", "00080122", "00080162", "00080202", "00080155", "00080235", "00080239", "00080240", "00080189", "00080007", "00080021", "00080024", "00080029",
			"00080032", "00080043", "00080045", "00080048", "00080073", "00080078", "00080082", "00080083", "00080089", "00080115", "00080124", "00080148", "00080149", "00080151", "00080156", "00080166", "00080254", "00080255", "00080256", "00080257", "00080258", "00080259",
			"00080260", "00080261", "00080262", "00080263", "00080264", "00080265", "00080266", "00080267", "00080268", "00080269", "00080270", "00080271", "00080272", "00080273", "00080274", "00080275", "00080276", "00080277", "00080278", "00080279", "00080280", "00080281",
			"00080282", "00080283", "00080284", "00080285", "00080286", "00080287", "00080288", "00080289", "00080010", "00080017", "00080076", "00080079", "00080081", "00080291", "00080296", "00080297" };
	/**
	 * 银行名称
	 */
	private static String[] bankName = { "中国工商银行", "中国农业银行", "中国银行", "中国建设银行", "交通银行", "招商银行", "中国民生银行", "兴业银行", "中国光大银行", "深圳平安银行", "中国邮政储蓄银行", "浦发银行", "中信银行", "上海银行", "北京银行", "安顺市商业银行", "安阳市商业银行", "保定市商业银行", "渤海银行", "沧州银行", "江苏常熟农村商业银行", "成都农商银行", "承德银行", "东莞农商银行", "德阳银行",
			"鄂尔多斯银行", "福建海峡银行", "抚顺银行", "广东农村信用社", "广州市农村信用社", "桂林银行", "赣州银行", "海南省农村信用社联合社", "邯郸银行", "河北省农村信用社联合社", "河北银行", "鹤壁银行", "衡水市商业银行", "湖北银行", "湖北农村信用社联合社", "湖南省农村信用社联合社", "花旗银行(中国)有限公司", "徽商银行", "嘉兴银行", "江阴市农村商业银行股份有限公司", "江苏省农村信用社联合社", "江苏银行", "江西农信社", "锦州银行", "晋城银行",
			"晋中市商业银行", "九江银行", "金华银行", "昆仑银行", "库尔勒市商业银行", "曲靖市商业银行", "昆山农村商业银行", "乐山市商业银行", "凉山州商业银行", "临商银行", "柳州银行", "南昌银行", "南京银行", "内蒙古农村信用社", "内蒙古银行", "攀枝花市商业银行", "齐鲁银行", "秦皇岛市商业银行", "泉州银行", "三门峡市商业银行", "山东省农村信用社", "山西省农村信用社", "商丘市商业银行", "深圳福田银座村镇银行", "深圳农村商业银行",
			"顺德农村商业银行", "遂宁市商业银行", "苏州银行", "太仓农村商业银行", "泰安市商业银行", "唐山市商业银行", "天津滨海农村商业银行", "威海商业银行", "潍坊银行", "温州银行", "乌海银行", "乌鲁木齐商业银行", "江苏锡州农村商业银行", "吴江农村商业银行", "象山县绿叶城市信用社", "邢台银行", "许昌银行", "雅安市商业银行", "阳泉市商业银行", "宜宾市商业银行", "玉溪市商业银行", "渣打银行", "张家港农村商业银行", "张家口市商业银行",
			"浙江稠州商业银行", "周口市商业银行", "自贡市商业银行", "遵义市商业银行", "厦门银行", "深圳发展银行", "上海农商银行", "武汉农商银行", "广东发展银行", "盛京银行", "广西北部湾银行", "南充银行", "江苏江南农村商业银行", "重庆农商行", "广州银行", "成都银行", "哈尔滨银行", "营口银行", "星展银行(中国)有限公司", "法国兴业银行(中国)有限公司", "台州银行", "青岛市商业银行", "南京市商业银行", "浙江民泰商业银行", "重庆三峡银行",
			"安徽省农村信用社联合社", "贵州银行安顺分行", "长安银行", "长治商行", "朝阳银行", "富滇银行", "广西农村信用社联合社", "葫芦岛银行", "吉林省农村信用合作社", "吉林银行", "莱商银行", "临沂商业银行", "龙江银行", "漯河商行", "宁波东海银行", "宁夏黄河农村商业银行", "平顶山银行", "青海省农村信用社联合社", "上饶银行", "四川省农村信用合作社", "云南省农村信用联社", "郑州银行", "包商银行", "华融湘江银行", "辽宁省农村信用社联合社",
			"辽阳银行", "六盘水市商业银行", "齐商银行", "青海银行", "陕西省农村信用社联合社", "绍兴银行", "信阳银行", "兰州银行", "铁岭商业银行", "鄞州银行", "驻马店银行", "华夏银行", "青岛银行", "宁波银行", "大连银行", "东莞银行", "绵阳银行", "贵阳银行", "福建省农村信用社联合社" };

	private static BiMap<String, String> bankCodeMap;

	/**
	 * 通过银行码获取银行名称或通过银行名称获取银行码
	 */
	public static String getCode(String str) {
		if (null == bankCodeMap) {
			bankCodeMap = Function.map(code, bankName);
		}
		if (str.matches("\\d+")) {
			return bankCodeMap.get(str); // 返回银行名称
		} else {
			return bankCodeMap.inverse().get(str); // 返回银行编码
		}
	}

	public static String[] getBankName() {
		return BankCode.bankName;
	}
}
