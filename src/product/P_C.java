package product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class P_C {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("temp/p_c.sql"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("temp/p_c2.sql"));
		String line = null;
		List<String> list = new ArrayList<String>();
		while ((line = reader.readLine()) != null) {
			list.add(line);
		}
		// 封装数据
		Map<String, String[]> map = new TreeMap<>();
		for (int i = 0; i < list.size(); i++) {
			String[] split1 = list.get(i).split(",");
			if (!map.containsKey(split1[0])) {
				map.put(split1[0], new String[5]);
			}
			String[] strs = map.get(split1[0]);
			if (!"".equals(split1[1])) {
				strs[0] = split1[1];
			}
			if (!"".equals(split1[2])) {
				strs[1] = split1[2];
			}
			if (!"".equals(split1[3])) {
				strs[2] = split1[3];
			}
			if (!"".equals(split1[4])) {
				strs[3] = split1[4];
			}
			if (!");".equals(split1[5])) {
				strs[4] = split1[5].substring(0, split1[5].length() - 2);
			}

			// 获得相同的高济id的集合
			for (int j = 0; j < list.size(); j++) {
				String[] split2 = list.get(j).split(",");
				if (split1[0] == split2[0]) {
					if (!"".equals(split2[1])) {
						strs[0] = split2[1];
					}
					if (!"".equals(split2[2])) {
						strs[1] = split2[2];
					}
					if (!"".equals(split2[3])) {
						strs[2] = split2[3];
					}
					if (!"".equals(split2[4])) {
						strs[3] = split2[4];
					}
					if (!");".equals(split2[5])) {
						strs[4] = split2[5].substring(0, split2[5].length() - 2);
					}
				}
			}
		}

		Set<Entry<String, String[]>> entrySet = map.entrySet();
		for (Entry<String, String[]> entry : entrySet) {
			String[] value = entry.getValue();
			writer.write(entry.getKey() + "," + value[0] + "," + value[1] + "," + value[2] + "," + value[3] + ","
					+ value[4] + ");");
			writer.newLine();
		}

		reader.close();
		writer.close();

	}


}
