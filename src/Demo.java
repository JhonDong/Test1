import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("temp/gj_cate_list_0204.csv"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("temp/demo.csv"));
		String line = null;
		List<String> l = new ArrayList<String>();
		while ((line = reader.readLine()) != null) {
			l.add(line);
		}

		Set<String> s1 = new HashSet<String>();
		for (String s : l) {
			// 处理第一层
			String[] split = s.split(",");
			// "2","2","11","处方药","1101","清热解毒用药","110101","清热解毒","11010101","清热泻火","能清气分热，对气分实热症，有泻火泄热的作用。
			// 主要成分是石膏；"
			// "28","处方药","27","处方药","2018-03-12 14:23:33","2018-03-12
			// 14:23:33","0,27,"
			// 一级id
			String id1 = split[2];
			// 一级name
			String name1 = split[3];
			// 拼接一级目录
			String one = id1 + "," + name1 + ",\"1\"," + name1
					+ ",\"2018-03-12 14:23:33\",\"2018-03-12 14:23:33\",\"0,1,\"";
			s1.add(one);
			// 拼接二级目录
			// 二级id
			String id2 = split[4];
			// 二级name
			String name2 = split[5];
			id1 = id1.split("\"")[1];
			String two = id2 + "," + name2 + ",\"" + id1 + "\"," + name2
					+ ",\"2018-03-12 14:23:33\",\"2018-03-12 14:23:33\",\"0,1," + id1 + ",\"";
//			s1.add(two);

			// 拼接三级目录
			// 三级id
			String id3 = split[6];
			// 三级name
			String name3 = split[7];
			id2 = id2.split("\"")[1];
			String three = id3 + "," + name3 + ",\"" + id2 + "\"," + name3
					+ ",\"2018-03-12 14:23:33\",\"2018-03-12 14:23:33\",\"0,1," + id1 + "," + id2 + ",\"";
//			s1.add(three);

			// 拼接四级目录

			// 四级id
			String id4 = split[8];
			// 四级name
			String name4 = split[9];
			id3 = id3.split("\"")[1];
			String four = id4 + "," + name4 + ",\"" + id3 + "\"," + split[10]
					+ ",\"2018-03-12 14:23:33\",\"2018-03-12 14:23:33\",\"0,1," + id1 + "," + id2 + "," + id3 + ",\"";
//			s1.add(four);

		}

		for (String string : s1) {
			System.out.println(string);
//			writer.write(string);
//			writer.newLine();
		}
System.out.println(s1.size());
		writer.close();
		reader.close();
	}

}
