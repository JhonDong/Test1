import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("temp/product.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("temp/product1.txt"));
		String line = null;
		// 970920066407206912,测试1,白加黑感冒药 阿司匹林维生素C泡腾片10片,aa,11,其他,11,11,11,11,北京和平西桥,11,122,2,2018/3/6,11,11,11010101,0,2018/3/6 00:00:00,2018/3/13 15:54:11,测试用例
		//972009460169969664,盐酸吗啉胍片,盐酸吗啉胍片,0.1g*100片,片剂,国药准字H13023469,瓶,北京中新药业股份有限公司(原北京中新制药厂,北京中新药业股份有限公司(原北京中新制药厂,东升,10532,11310501,未提供
		while ((line = reader.readLine()) != null) {
			
			StringBuffer sb=new StringBuffer();
			String[] split = line.split(",");
			sb.append(split[0]+",");
			sb.append(split[1]+",");
			sb.append(split[2]+",");
			sb.append(",");
			sb.append(split[3]+",");
			sb.append(split[4]+",");
			sb.append(split[5]+",");
			if(split.length==13){
				sb.append(split[12]+",");
			}else{
				sb.append(",");
			}
			sb.append(",");
			sb.append(split[6]+",");
			sb.append(split[7]+",");
			sb.append(split[8]+",");
			sb.append(",");
			sb.append("2,");
			sb.append("2018/3/6,");
			sb.append("A,");
			sb.append(",");
			sb.append(split[11]+",");
			sb.append("0,");
			sb.append("2018/3/6 00:00:00,");
			sb.append("2018/3/6 00:00:00,");
			writer.write(sb.toString());
			writer.newLine();
			
		}
		reader.close();
		writer.close();
		

	}

}
