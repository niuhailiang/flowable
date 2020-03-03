package com.dapeng.flow.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.TableConfiguration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
/**
 * 
 * @author niuhailiang
 *
 */
public class GeneratorSqlmap {
	public void generator() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		String path=getClass().getClassLoader().getResource("mybatis-generator.xml").getPath();
		// 指定配置文件
		File configFile = new File(path);
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		//动态获取
		//List<Context> contextlist=config.getContexts();
//		if(contextlist!=null&&contextlist.size()>0){
//			Context context=contextlist.get(0);
//			TableConfiguration tableConfig=new TableConfiguration(context);
//			tableConfig.setTableName("t_attachment");
//			tableConfig.setDomainObjectName("AttachmentDo");
//			tableConfig.setCountByExampleStatementEnabled(false);
//			tableConfig.setUpdateByExampleStatementEnabled(false);
//			tableConfig.setDeleteByExampleStatementEnabled(false);
//			tableConfig.setSelectByExampleStatementEnabled(false);
//			context.addTableConfiguration(tableConfig);
//		}
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
 
	// 执行main方法以生成代码
	public static void main(String[] args) {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
