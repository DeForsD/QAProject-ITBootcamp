package travels_utils;

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class ExelManipulator {
	private XSSFWorkbook wb = null;
	private XSSFSheet sheet = null;
	private String excellPath;

	public boolean setExcell(String path) 
	{
		if (wb != null) 
		{
			try 
			{
				wb.close();
			} 
			
			catch (Exception e) 
			{
				System.out.println(e.toString());
				return false;
			}
		}
		
		File f = new File(path);
		
		try 
		{
			FileInputStream fis = new FileInputStream(f);

			wb = new XSSFWorkbook(fis);
			excellPath = path;
			return true;
		} 
		
		catch (Exception e) 
		{
			System.out.println(e.toString());
			System.out.println("Lose otvaranje fajla!");
			return false;
		}
	}
	
	public boolean setWorkSheet(int index) 
	{
		try 
		{
			sheet = wb.getSheetAt(index);
			return true;
		} 
		
		catch (Exception e) 
		{
			System.out.println(e.toString());
			System.out.println("Lose otvaranje worksheeta!");
			return false;
		}
	}
	
	public String getDataAt(int row, int column) 
	{
		
		try 
		{
			XSSFRow r = sheet.getRow(row);
			XSSFCell celija = r.getCell(column);
			return celija.toString();
		} 
		
		catch (NullPointerException e) 
		{
			System.out.println(e.toString());
			System.out.println("Nesto je null!");
		} 
		
		catch (Exception e) 
		{
			System.out.println(e.toString());
			System.out.println("Doslo je do greske!");
		}
		return "";
	}

	public int getRowNumber() 
	{
		try 
		{
			return sheet.getLastRowNum() + 1;
		} 
		
		catch (Exception e) 
		{
			System.out.println(e.toString());
			System.out.println("Doslo je do greske!");
			return -1;
		}
	}

	public boolean closeExcell() 
	{
		if (wb != null) 
		{
			try 
			{
				wb.close();
				wb = null;
				return true;
			} 
			
			catch (IOException e) 
			{
				e.printStackTrace();
				wb = null;
				return false;
			}

		}
		return true;
	}

}
