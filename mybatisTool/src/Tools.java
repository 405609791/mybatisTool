import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Tools
{

	public static void main(String[] args)
	{
		try
		{
			Clean.deleteFiles(Clean.model);
			Clean.deleteFiles(Clean.mybatis);
			Clean.deleteFiles(Clean.xmlmapper);
			System.out.println("Clean Success");
			
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			File configFile = new File("src\\generatorConfig.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config;

			config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
			System.out.println("Create Success");
		}
		catch (Exception e)
		{
			System.out.println("Failure");
			e.printStackTrace();
		}
	}
}