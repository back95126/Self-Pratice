import java.util.*;
import java.io.*;

public class Store{
	
	
		ArrayList<Book> book_list = new ArrayList<Book>();
		
		int name=1 , author=1 , publisher=1 , number=1, type=1 , year=1; 
		
		String t1=null,t2=null,t3=null;
		
		Book book = null;
		
		Scanner cin = new Scanner(System.in);
	
		public static void main(String[] args)throws Exception
		{	
			Store store = new Store();
			
			store.welcome();
			
			store.prepare();
			
			store.login();
			
			store.UI();
			
			
		}
		public void welcome()throws Exception
		{	
			System.out.println("------------------------");
			System.out.println("歡迎使用個人書籍管理系統");
			System.out.println("------------------------");
		}
		
		public void prepare()throws Exception
		{
			
			String str;
			
			Scanner sc =null;
			
			try
			{
				 sc = new Scanner(new FileInputStream("book.txt"));
			}
			catch(FileNotFoundException er)
			{
				System.out.println("--------------------------------");
				System.out.println("檔案遺失或格式錯誤，請再試一次!");
				System.out.print("--------------------------------");
			
				System.exit(0);
			}
			
			
			String temp_name = null , temp_author = null, temp_publisher = null , temp_number = null , temp_type = null , temp_year = null;
			
			t1 = sc.nextLine();
			t2 = sc.nextLine();
			t3 = sc.nextLine();
			
			while(sc.hasNext())
			{
				temp_name = sc.next();
				temp_author = sc.next();
				temp_publisher = sc.next();
				temp_number = sc.next();
				temp_type = sc.next();
				temp_year = sc.next();
				
				book = new Book(temp_name, temp_author , temp_publisher , temp_number , temp_type , temp_year);
				book_list.add(book);
			}
			
		
			sc.close();
			
		}
		public  void login()throws Exception
		{
			String account=null,password=null;
			
			int ter=-1;
			
			while(ter!=0)
			{
			System.out.print("帳號 : ");
			account = cin.nextLine();
			
			System.out.print("密碼 : ");
			password = cin.nextLine();
			
			if(account.equals("cis")&&password.equals("1234")) ter=0;
			else System.out.println("-------帳號或密碼錯誤!-------");
			}
			
			System.out.println("------------------------");
			System.out.println("------------------------");
			
		}		
		
		public void UI()throws Exception
		{	
			String id;
			int ter=-1;
			
			
			while(ter!=0)
			{
			
			System.out.println("A:使用者介面	B:管理者介面");
			System.out.println("請選擇功能介面 (輸入-1登出): ");
			System.out.print("=> ");
				
			id = cin.next();
			
			switch(id)
			{
			case"A":
				ter=0;
				user();
				break;
			case"B":
				ter=0;
				admin();
				break;
			case"-1":
				ter=0;
				quit();
				break;
			default:
				System.out.println("-------------------------");
				System.out.println("錯誤，請重新輸入後再嘗試一次!");
				System.out.println("-------------------------");
				break; 
			}
			}
			
			
		}
		public void admin()throws Exception
		{
			int ter1 = -1;
			String id=null;
			
			while(ter1!=0)
			{
			System.out.println("-------------------------");
			System.out.println("|A.設定須顯示之欄位	|");		 
			System.out.println("|B.神秘功能		|");		 
			System.out.println("|C.離開			|");	
			System.out.println("-------------------------");
			System.out.print("=>");
			
			id = cin.next();
			
			switch(id)
			{
				case"A":
					ter1=0;
					display_set();
					break;
				case"B":
					ter1=0;
					System.out.print("B");
					break;
				case"C":
					ter1=0;
					System.out.println("-------------------------");
					UI();
					break;
				default:
					System.out.println("-------------------------");
					System.out.println("請重新輸入後再嘗試一次");
					break;
					
			}
			
		}
		}
		public void display_set()throws Exception
		{
			System.out.println("是否顯示書名(1/0) :");
			System.out.print("=> ");
			
			name = cin.nextInt();
			
			System.out.println("是否顯示作者(1/0) :");
			System.out.print("=> ");
			
			author = cin.nextInt();
			
			System.out.println("是否顯示出版社(1/0) :");
			System.out.print("=> ");
			
			publisher = cin.nextInt();
			
			System.out.println("是否顯示編號(1/0) :");
			System.out.print("=> ");
			
			number = cin.nextInt();
			
			System.out.println("是否顯示分類(1/0) :");
			System.out.print("=> ");
			
			type = cin.nextInt();
			
			System.out.println("是否顯示出版年份(1/0) :");
			System.out.print("=> ");
			
			year = cin.nextInt();
			
			System.out.println("-------------------------");
			System.out.println("設定完成");
			System.out.println("-------------------------");
			
			pause();
			admin();
		}
		
		public void user()throws Exception
		{	
			int ter1=-1;
			String ter2=null;
			
			while(ter1!=0)
			{
			System.out.println("-------------------------");
			System.out.println("|	A.新增書籍	|");		 
			System.out.println("|	B.查詢書籍	|");		 
			System.out.println("|	C.修改書籍	|");		 
			System.out.println("|	D.刪除書籍	|");		 
			System.out.println("|	E.顯示書籍	|");
			System.out.println("|	F.維基搜尋	|");				
			System.out.println("|	G.離開	  	|");	
			System.out.println("-------------------------");
			System.out.print("=>");
			
			
			ter2 = cin.next();
			
				switch(ter2) 
					{
						case"A":
								ter1=0;
								book_add();
								break;
						case"B":
								ter1=0;
								search();
								break;
						case"C":
								ter1=0;
								modify();
								break;
						case"D":
								ter1=0;
								delete();
								break;
						case"E":
								ter1=0;
								display();
								break;
						case"F":
								ter1=0;
								wiki_search();
								break;
						case"G":
								ter1=0;
								UI();
								break;
						default:
								System.out.println("-------------------------");
								System.out.println("請重新輸入後再嘗試一次");
								break;
								
					}
			}
			
		}
		public void book_add()throws Exception
		{	
			int ter=-1;
			String str=null;
			book = new Book();
			
			System.out.println("-------------------------");
			System.out.println("請輸入書名 (輸入-1離開) :");
			System.out.print("=>");
			
			str = cin.next();
			if(!str.equals("-1"))
			{
			while(!book.setName(str))
				str = cin.next();
			/////////////////////////////////////////////
			
			System.out.println("請輸入作者 :");
			System.out.print("=>");
			
			str = cin.next();
			while(!book.setAuthor(str))
				str = cin.next();
			////////////////////////////////////////////
			
			System.out.println("請輸入出版社 :");
			System.out.print("=>");
			
			str = cin.next();
			while(!book.setPublisher(str))
				str = cin.next();
			/////////////////////////////////////////////
			
			System.out.println("請輸入編號 :");
			System.out.print("=>");
			
			str = cin.next();
			while(!book.setNumber(str))
				str = cin.next();
			/////////////////////////////////////////////
			
			while(ter!=0)
			{
			System.out.println("請選擇類別 :");
			System.out.println("A.General 		B.Philosophy			C.Religion		D.Science");
			System.out.println("E.Math			F.Language			G.Art		");
			System.out.print("=>");
			str = cin.next();
			
			switch(str)
			{
			case"A":
				book.setType("General");
				ter=0;
				break;
			case"B":
				book.setType("Philosophy");
				ter=0;
				break;
			case"C":
				book.setType("Religion");
				ter=0;
				break;
			case"D":
				book.setType("Science");
				ter=0;
				break;
			case"E":
				book.setType("Math");
				ter=0;
				break;
			case"F":
				book.setType("Language");
				ter=0;
				break;
			case"G":
				book.setType("Art");
				ter=0;
				break;
			default:
				System.out.println("請再輸入一次!");
				break;
			}
			}
			
			/////////////////////////////////////////////
			System.out.println("請輸入年份 :");
			System.out.print("=>");
			
			str = cin.next();
			while(!book.setYear(str))
				str = cin.next();
			
			book_list.add(book);
			System.out.println("-------------------------");
			System.out.println("新增完成");
			System.out.println("-------------------------");
			}
			else
			{
				System.out.println("-------------------------");
			}
			pause( );
			user();
		
			
		}
		public void search()throws Exception
		{	
			String id,str;
			int ter=-1,count=0;
			System.out.println("請選擇要查詢之欄位(輸入-1離開) :");
			System.out.println("A.書名	 B.作者  C.出版社  D.編號");
			System.out.print("=> ");
			
			while(ter!=0)
			{
			id =cin.next();
			if(id.equals("-1"))
				break;
			else
			{
			switch(id)
			{
				case"A":
					count=0;
					System.out.println("請輸入欲查詢之內容");
					System.out.print("=> ");
					str = cin.next();
					System.out.println("------------------------------------------------------");
					System.out.println("搜尋結果");
					System.out.println("------------------------------------------------------");
					System.out.println("書名    作者    出版社   編號     分類     出版年份");
					for(int i=0; i<book_list.size();i++)
					{
						if(str.equalsIgnoreCase(book_list.get(i).getName()))
						{	
							
							System.out.printf( "%-8s", book_list.get( i ).getName() );
							System.out.printf( "%-8s", book_list.get( i ).getAuthor() );
							System.out.printf( "%-8s", book_list.get( i ).getPublisher() );
							System.out.printf( "%-10s", book_list.get( i ).getNumber() );
							System.out.printf( "%-13s", book_list.get( i ).getType() );
							System.out.printf( "%-4s", book_list.get( i ).getYear() );
							System.out.println();
							count++;
						}
					}
						System.out.println("------------------------------------------------------");
						System.out.println("共有" + count + "筆資料符合");
						System.out.println("------------------------------------------------------");
					ter=0;
					break;
				case"B":
					count=0;
					System.out.println("請輸入欲查詢之內容");
					System.out.print("=> ");
					str = cin.next();
					System.out.println("------------------------------------------------------");
					System.out.println("搜尋結果");
					System.out.println("------------------------------------------------------");
					System.out.println("書名    作者    出版社   編號     分類     出版年份");
					for(int i=0; i<book_list.size();i++)
					{
						if(str.equalsIgnoreCase(book_list.get(i).getAuthor()))
						{	
							
							System.out.printf( "%-8s", book_list.get( i ).getName() );
							System.out.printf( "%-8s", book_list.get( i ).getAuthor() );
							System.out.printf( "%-8s", book_list.get( i ).getPublisher() );
							System.out.printf( "%-10s", book_list.get( i ).getNumber() );
							System.out.printf( "%-13s", book_list.get( i ).getType() );
							System.out.printf( "%-4s", book_list.get( i ).getYear() );
							System.out.println();
							count++;
						}
					}
						System.out.println("------------------------------------------------------");
						System.out.println("共有" + count + "筆資料符合");
						System.out.println("------------------------------------------------------");
					ter=0;
					break;
				case"C":
					count=0;
					System.out.println("請輸入欲查詢之內容");
					System.out.print("=> ");
					str = cin.next();
					System.out.println("------------------------------------------------------");
					System.out.println("搜尋結果");
					System.out.println("------------------------------------------------------");
					System.out.println("書名    作者    出版社   編號     分類     出版年份");
					for(int i=0; i<book_list.size();i++)
					{
						if(str.equalsIgnoreCase(book_list.get(i).getPublisher()))
						{	
							
							System.out.printf( "%-8s", book_list.get( i ).getName() );
							System.out.printf( "%-8s", book_list.get( i ).getAuthor() );
							System.out.printf( "%-8s", book_list.get( i ).getPublisher() );
							System.out.printf( "%-10s", book_list.get( i ).getNumber() );
							System.out.printf( "%-13s", book_list.get( i ).getType() );
							System.out.printf( "%-4s", book_list.get( i ).getYear() );
							System.out.println();
							count++;
						}
					}
						System.out.println("------------------------------------------------------");
						System.out.println("共有" + count + "筆資料符合");
						System.out.println("------------------------------------------------------");
					ter=0;
					break;
				case"D":
					count=0;
					System.out.println("請輸入欲查詢之內容");
					System.out.print("=> ");
					str = cin.next();
					System.out.println("------------------------------------------------------");
					System.out.println("搜尋結果");
					System.out.println("------------------------------------------------------");
					System.out.println("書名    作者    出版社   編號     分類     出版年份");
					for(int i=0; i<book_list.size();i++)
					{
						if(str.equalsIgnoreCase(book_list.get(i).getNumber()))
						{	
							
							System.out.printf( "%-8s", book_list.get( i ).getName() );
							System.out.printf( "%-8s", book_list.get( i ).getAuthor() );
							System.out.printf( "%-8s", book_list.get( i ).getPublisher() );
							System.out.printf( "%-10s", book_list.get( i ).getNumber() );
							System.out.printf( "%-13s", book_list.get( i ).getType() );
							System.out.printf( "%-4s", book_list.get( i ).getYear() );
							System.out.println();
							count++;
						}
					}
						System.out.println("------------------------------------------------------");
						System.out.println("共有" + count + "筆資料符合");
						System.out.println("------------------------------------------------------");
					ter=0;
					break;
				default:
					System.out.print("錯誤，請重新輸入後再嘗試一次");
					break;
			}
			}
			}
			pause();
			user();
		}
		public void modify()throws Exception
		{	
			int num=1 , ter=-1;
			
			System.out.println("     書名   作者   出版社   編號      分類    出版年份");
			System.out.println("------------------------------------------------------");
			for(int i=0 ; i<book_list.size();i++)
			{	System.out.printf( "%-3d", i+1);
				System.out.printf( "%-8s", book_list.get( i ).getName() );
				System.out.printf( "%-8s", book_list.get( i ).getAuthor() );
				System.out.printf( "%-8s", book_list.get( i ).getPublisher() );
				System.out.printf( "%-8s", book_list.get( i ).getNumber() );
				System.out.printf( "%-13s", book_list.get( i ).getType() );
				System.out.printf( "%-4s", book_list.get( i ).getYear() );
				System.out.println();
				
			}
			System.out.println("------------------------------------------------------");
			System.out.println("請選擇需要修改之書籍排序(輸入-1離開) : ");
			System.out.print("=> ");
			
			num = cin.nextInt();
			
			while(num>0&&num<book_list.size())
			{
				num = num-1;
			
				String id=null , str2=null;
				while(ter!=0)
				{
				System.out.println("請選擇需要修改之欄位");
				System.out.println("A.書名	B.作者	C.出版社");
				System.out.println("D.編號	E.分類	F.出版年份");
				System.out.print("=> ");
				
				id = cin.next();
				switch(id)
				{
					case"A":
						ter=0;
						System.out.println("請輸入新的書名");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setName(str2);
						break;
					case"B":
						ter=0;
						System.out.println("請輸入新的作者");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setAuthor(str2);
						break;
					case"C":
						ter=0;
						System.out.println("請輸入新的出版社");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setPublisher(str2);
						break;
					case"D":
						ter=0;
						System.out.println("請輸入新的編號");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setNumber(str2);
						break;
					case"E":
						ter=0;
						System.out.println("A.General 		B.Philosophy			C.Religion		D.Science");
						System.out.println("E.Math			F.Language			G.Art		");
						System.out.println("請選擇欲修改之分類");
						System.out.print("=> ");
						str2 = cin.next();
						switch(str2)
						{
							case"A":
							book_list.get(num).setType("General");
							break;
							case"B":
							book_list.get(num).setType("Philosophy");
							break;
							case"C":
							book_list.get(num).setType("Religion");
							break;
							case"D":
							book_list.get(num).setType("Science");
							break;
							case"E":
							book_list.get(num).setType("Math");
							break;
							case"F":
							book_list.get(num).setType("Language");
							break;
							case"G":
							book_list.get(num).setType("Art");
							break;
							default:
								System.out.print("分類錯誤，修改失敗。請稍後再嘗試...");
						}
						break;
					case"F":
						ter=0;
						System.out.println("請輸入新的出版年份");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setYear(str2);
						break;
					default:
						System.out.print("錯誤，請重新輸入後再嘗試一次!");
						break;
				}	
				}
				
			}
			
			pause();
			user();
			
		}
			
		public void title_set()throws Exception
		{
			if(name!=0)System.out.print("    書名");
				else System.out.printf("       ");
			if(author!=0)System.out.print("   作者");
				else System.out.printf("       ");
			if(publisher!=0)System.out.print("   出版社");
				else System.out.printf("	       ");
			if(number!=0)System.out.print("   編號");
				else System.out.printf("	       ");
			if(type!=0)System.out.print("     分類");
				else System.out.printf("	    ");
			if(year!=0)System.out.print("     出版年份");
				else System.out.printf("	  ");
			
		}
		
		public void delete()throws Exception
		{	
			int num=1;
			System.out.println("     書名   作者   出版社   編號      分類    出版年份");
			System.out.println("------------------------------------------------------");
			for(int i=0 ; i<book_list.size();i++)
			{	System.out.printf( "%-3d", i+1);
				System.out.printf( "%-8s", book_list.get( i ).getName() );
				System.out.printf( "%-8s", book_list.get( i ).getAuthor() );
				System.out.printf( "%-8s", book_list.get( i ).getPublisher() );
				System.out.printf( "%-8s", book_list.get( i ).getNumber() );
				System.out.printf( "%-13s", book_list.get( i ).getType() );
				System.out.printf( "%-4s", book_list.get( i ).getYear() );
				System.out.println();
				
			}
			System.out.println("------------------------------------------------------");
			System.out.println("請輸入需要刪除之書籍排序(輸入-1離開) : ");
			System.out.print("=> ");
			
			num = cin.nextInt();
			
			if(num==-1) 
			{
			System.out.println("------------------------");	
			}
			else 
			{
				book_list.remove(num-1);
				System.out.println("------------------------");	
				System.out.println("刪除成功");	
				System.out.println("------------------------");	
			}
			pause();
			user();
			
		}
		public void display_all()throws Exception
		{
			
			title_set();
			System.out.println("\n------------------------------------------------------");
			for(int i=0 ; i<book_list.size();i++)
			{	System.out.printf( "%-3d", i+1);
				if(name!=0)System.out.printf( "%-8s", book_list.get( i ).getName() );
					else System.out.printf( "	  ");
				if(author!=0)System.out.printf( "%-8s", book_list.get( i ).getAuthor() );
					else System.out.printf( "	  ");
				if(publisher!=0)System.out.printf( "%-8s", book_list.get( i ).getPublisher() );
					else System.out.printf( "	  ");
				if(number!=0)System.out.printf( "%-8s", book_list.get( i ).getNumber() );
					else System.out.printf( "	    ");
				if(type!=0)System.out.printf( "%-13s", book_list.get( i ).getType() );
					else System.out.printf( "	   ");
				if(year!=0)System.out.printf( "%-4s", book_list.get( i ).getYear() );
					else System.out.printf( "	  ");
				System.out.println();
				
			}
			
			
			System.out.println("------------------------------------------------------");
		}
		public void display()throws Exception
		{	
			String id;
			int ter=-1;
			System.out.println("請選擇顯示方式 (輸入-1離開):");
			System.out.println("A.全部顯示   B.分類顯示");
			System.out.print("=> ");
			while(ter!=0)
			{	
					id = cin.next();
					
				switch(id)
				{
					case"A":
						ter=0;
						display_all();
						break;
					case"B":
						ter=0;
						int count=0;
						String str2=null,temp=null;
						System.out.println("請選擇欲顯示之分類:");
						System.out.println("A.General 		B.Philosophy			C.Religion		D.Science");
						System.out.println("E.Math			F.Language			G.Art		");
						System.out.print("=> ");
						str2 = cin.next();
						switch(str2)
						{
							case"A":
								temp = "General";
							break;
							case"B":
								temp = "Philosophy";
							break;
							case"C":
								temp = "Religion";
							break;
							case"D":
								temp = "Science";
							break;
							case"E":
								temp = "Math";
							break;
							case"F":
								temp = "Language";
							break;
							case"G":
								temp = "Art";
							break;
							default:
								System.out.print("分類錯誤。請稍後再嘗試...");
						}	
							System.out.println("------------------------------------------------------");
							System.out.println("書名    作者    出版社   編號     分類     出版年份");
							System.out.println("------------------------------------------------------");
							for(int i=0;i<book_list.size();i++)
							{
								if(temp.equals(book_list.get(i).getType()))
								{	
									System.out.printf( "%-8s", book_list.get( i ).getName() );
									System.out.printf( "%-8s", book_list.get( i ).getAuthor() );
									System.out.printf( "%-8s", book_list.get( i ).getPublisher() );
									System.out.printf( "%-8s", book_list.get( i ).getNumber() );
									System.out.printf( "%-13s", book_list.get( i ).getType() );
									System.out.printf( "%-4s", book_list.get( i ).getYear() );
									System.out.println();
									count++;
								}
							}
							System.out.println("------------------------------------------------------");
							break;
					case"-1":
					ter=0;
					break;
					default:
					break;
				}
							
			}
			pause();
			user();
		}
		public void wiki_search()throws Exception
		{
			String id=null,str=null;
			int ter=-1;
			int num=0;
			while(ter!=0)
		{		
	
				System.out.println("請選擇欲搜尋之類型(輸入-1離開) :");
				System.out.println("A.館藏 	B.自定義");
				System.out.print("=> ");
				id = cin.next();
			switch(id)
			{
				case"A":
					ter=0;
					display_all();
					System.out.println("請輸入欲搜尋書本之排序:");
					System.out.print("=> ");
					
					
						num = cin.nextInt();
						if(num>book_list.size()) System.out.println("輸入排序錯誤!");
					else
					{
						str = book_list.get(num-1).getName();
						search_for(str);
						System.out.println("-------------------------");
						System.out.println("搜尋完成");
						System.out.println("-------------------------");
					}
					break;
				case"B":
					ter=0;
					System.out.println("請輸入欲搜尋之內容:");
					System.out.print("=> ");
					
					str = cin.next();
					
					search_for(str);
					System.out.println("-------------------------");
					System.out.println("搜尋完成");
					System.out.println("-------------------------");
					break;
				case"-1":
					ter=0;
					break;
				default:
					System.out.println("-------------------------");
					System.out.println("請重新輸入後再嘗試一次");
					System.out.println("-------------------------");
					break;
			}
		}
			pause();
			user();
		}
		public void quit()throws Exception
		{	
			String id;
			int ter=-1;
			
			
			while(ter!=0)
			{
			System.out.println("------------------------");
			System.out.println("是否保存變更? (Y/N)");
			System.out.print("=> ");
				
			id = cin.next();
			
			switch(id)
			{
			case"Y":
				ter=0;
				save();
				break;
			case"N":
				ter=0;
				System.out.print("------------------------");
				break;
			default:
				System.out.println("------------------------------");
				System.out.println("錯誤，請重新輸入後再嘗試一次!");
				System.out.println("------------------------------");
				break; 
			}
			}
			
		}
		public void save()throws Exception
		{
			
			PrintWriter pw = null;
			
			try
			{
				pw = new PrintWriter( new FileOutputStream("book.txt") );
			}
			catch(FileNotFoundException fe)
			{
				System.out.println("--------------------------------");
				System.out.println("檔案遺失或格式錯誤，請再試一次!");
				System.out.print("--------------------------------");
				System.exit(0);
			}
			
			pw.println("------------------------------------------------------");
			pw.println("書名    作者    出版社   編號     分類     出版年份");
			pw.println("------------------------------------------------------");
			
			for(int i=0; i<book_list.size(); i++) 
			{
				pw.printf( "%-8s", book_list.get( i ).getName() );
				pw.printf( "%-8s", book_list.get( i ).getAuthor() );
				pw.printf( "%-8s", book_list.get( i ).getPublisher() );
				pw.printf( "%-8s", book_list.get( i ).getNumber() );
				pw.printf( "%-13s", book_list.get( i ).getType() );
				pw.printf( "%-4s", book_list.get( i ).getYear() );
				pw.println();
			}
			pw.close();
		}
		public void search_for(String s)throws Exception
		{
		
		String str2=null,wiki="https://zh.wikipedia.org/wiki/";
		
		str2 = wiki + s;
		
        java.net.URI uri = new java.net.URI(str2);
        java.awt.Desktop.getDesktop().browse(uri);
		}
		public void pause( )throws Exception 
		{
	System.out.print("輸入Enter鍵回到上一頁...");
	try
	{
         	System.in.read();
	}
	catch(Exception e) {}
      }
		
		
}
