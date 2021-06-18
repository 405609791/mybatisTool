import java.io.File;

public class Clean
{
	protected static String model = "src\\com\\xiaoniu56\\model\\defaults";
	protected static String mybatis = "src\\mybatis\\defaults";
	protected static String xmlmapper = "src\\com\\xiaoniu56\\dao";

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		deleteFiles(model);
		deleteFiles(mybatis);
		deleteFiles(xmlmapper);
		System.out.println("Clean Success");
	}

	public static void deleteFiles(String path)
	{
		File f = new File(path);
		if (f.isFile())
		{
			f.delete();
		}
		else
		{
			String[] names = f.list();
			if (names != null)
			{
				for (int i = 0; i < names.length; i++)
				{
					deleteFiles(path + File.separator + names[i]);
				}
			}
		}
	}

}
