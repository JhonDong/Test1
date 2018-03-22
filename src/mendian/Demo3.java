package mendian;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*`code` varchar(20) DEFAULT NULL COMMENT '门店编码',
`name` varchar(255) DEFAULT NULL COMMENT '门店名称',
`opening_time` varchar(20) DEFAULT NULL COMMENT '开业时间',
`close_time` varchar(20) DEFAULT NULL COMMENT '关店时间',
`store_nature1` enum('县乡店','商业店','社区店','院边店') DEFAULT NULL COMMENT '门店性质',
`store_nature2` enum('成熟门店','成长门店','次新门店','新开门店') DEFAULT NULL COMMENT '门店性质',
`getway` enum('加盟','直营') DEFAULT NULL COMMENT '获得方式',
`acquisition` datetime DEFAULT NULL COMMENT '收购时间',
`address` varchar(255) DEFAULT NULL COMMENT '门店地址',
`partition` varchar(255) DEFAULT NULL COMMENT '行政区划',
`houses_nature` enum('无产权/小产权房产','住宅','商用') DEFAULT NULL COMMENT '房屋性质',
`is_deed` tinyint(4) DEFAULT NULL COMMENT '有无房产证',
`is_rental_contract` tinyint(4) DEFAULT NULL COMMENT '是否签订房租合同',
`is_landlord_rents` tinyint(4) DEFAULT NULL COMMENT '是否直接与房东签约',
`lessor` varchar(255) DEFAULT NULL COMMENT '出租方',
`lessee` varchar(255) DEFAULT NULL COMMENT '承租方',
`lease_start_date` date DEFAULT NULL COMMENT '租赁开始日',
`lease_end_date` date DEFAULT NULL COMMENT '租赁结束日',
`is_medical_insurance` tinyint(4) DEFAULT NULL COMMENT '是否医保',
`is_invoice` tinyint(4) DEFAULT NULL COMMENT '是否能取得房租发票',
`is_sublet` tinyint(4) DEFAULT NULL COMMENT '是否转租',
`month_sublet_income` varchar(255) DEFAULT NULL COMMENT '当月转租收入',
`acreage` int(255) DEFAULT NULL COMMENT '面积',
`rental_area` int(11) DEFAULT NULL COMMENT '租赁面积',
`business_area` int(11) DEFAULT NULL COMMENT '经营面积',
`taxpayer_qualification` varchar(255) DEFAULT NULL COMMENT '纳税人资质',*/
public class Demo3 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("temp/mendian.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("temp/mendian1.txt"));
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] split = line.split(",");
			StringBuffer sb=new StringBuffer();
			sb.append("'"+split[0].trim()+"',");
			sb.append("'"+split[1].trim()+"',");
			sb.append("'"+split[2].trim()+"',");
			sb.append("'"+split[4].trim()+"',");
			sb.append("'"+split[5].trim()+"',");
			sb.append("'"+split[7].trim()+"',");
			sb.append("'"+split[8].trim()+"',");
			sb.append("'"+split[9].trim()+"',");
			sb.append("'"+split[10].trim()+"',");
			sb.append("'1',");
			sb.append("'1',");
			sb.append("'1',");
			sb.append("'"+split[14].trim()+"',");
			sb.append("'"+split[15].trim()+"',");
			sb.append("'"+split[16].trim()+"',");
			sb.append("'"+split[17].trim()+"',");
			sb.append("'0',");
			sb.append("'0',");
			sb.append("'"+split[20]+"',");
			sb.append("'"+split[21].trim()+"',");
			sb.append("'"+split[22].trim()+"',");
			sb.append("'"+split[23].trim()+"',");
			sb.append("'1'");
			writer.write(sb.toString());
			writer.newLine();
		}
		reader.close();
		writer.close();
		

	}

}
