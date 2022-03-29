package Work;

import java.io.File;
import java.io.FileFilter;
/**
 * @author longma
 * @create 2022-03-28-10:48
 **/

/**
 * 列出当前目录中所有名字包含s的子项。
 *
 * 使用匿名内部类和lambda两种写法
 *
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 *
 *
 *
 */
/*
	提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//定义当前目录
	File dir = new File(".");

	//定义一个文档数组
	File[] suns = dir.listFiles(new FileFilter() {
		public boolean accept(File file) {

		}
	});

	//用if先判断这个名字是否是一个目录
	if(dir.isDirectory()){

	}

	//输出数组中的每个元素
	System.out.println(subs[i].getName());

	//返回类型名称
	return file.getName().contains("s");

	//遍历数组里面的每个元素
	for(int i=0;i<subs.length;i++){

	}



 */
public class Test01 {
	public static void main(String[] args) {
		File dir = new File(".");
		if(dir.isDirectory()){
			File[] subs = dir.listFiles(new FileFilter() {
				public boolean accept(File file) {
					return file.getName().contains("s");
				}
			});
			for(int i=0;i<subs.length;i++){
				System.out.println(subs[i].getName());
			}
		}

	}
}
