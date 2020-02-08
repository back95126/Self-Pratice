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
			System.out.println("�w��ϥέӤH���y�޲z�t��");
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
				System.out.println("�ɮ׿򥢩ή榡���~�A�ЦA�դ@��!");
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
			System.out.print("�b�� : ");
			account = cin.nextLine();
			
			System.out.print("�K�X : ");
			password = cin.nextLine();
			
			if(account.equals("cis")&&password.equals("1234")) ter=0;
			else System.out.println("-------�b���αK�X���~!-------");
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
			
			System.out.println("A:�ϥΪ̤���	B:�޲z�̤���");
			System.out.println("�п�ܥ\�श�� (��J-1�n�X): ");
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
				System.out.println("���~�A�Э��s��J��A���դ@��!");
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
			System.out.println("|A.�]�w����ܤ����	|");		 
			System.out.println("|B.�����\��		|");		 
			System.out.println("|C.���}			|");	
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
					System.out.println("�Э��s��J��A���դ@��");
					break;
					
			}
			
		}
		}
		public void display_set()throws Exception
		{
			System.out.println("�O�_��ܮѦW(1/0) :");
			System.out.print("=> ");
			
			name = cin.nextInt();
			
			System.out.println("�O�_��ܧ@��(1/0) :");
			System.out.print("=> ");
			
			author = cin.nextInt();
			
			System.out.println("�O�_��ܥX����(1/0) :");
			System.out.print("=> ");
			
			publisher = cin.nextInt();
			
			System.out.println("�O�_��ܽs��(1/0) :");
			System.out.print("=> ");
			
			number = cin.nextInt();
			
			System.out.println("�O�_��ܤ���(1/0) :");
			System.out.print("=> ");
			
			type = cin.nextInt();
			
			System.out.println("�O�_��ܥX���~��(1/0) :");
			System.out.print("=> ");
			
			year = cin.nextInt();
			
			System.out.println("-------------------------");
			System.out.println("�]�w����");
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
			System.out.println("|	A.�s�W���y	|");		 
			System.out.println("|	B.�d�߮��y	|");		 
			System.out.println("|	C.�ק���y	|");		 
			System.out.println("|	D.�R�����y	|");		 
			System.out.println("|	E.��ܮ��y	|");
			System.out.println("|	F.����j�M	|");				
			System.out.println("|	G.���}	  	|");	
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
								System.out.println("�Э��s��J��A���դ@��");
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
			System.out.println("�п�J�ѦW (��J-1���}) :");
			System.out.print("=>");
			
			str = cin.next();
			if(!str.equals("-1"))
			{
			while(!book.setName(str))
				str = cin.next();
			/////////////////////////////////////////////
			
			System.out.println("�п�J�@�� :");
			System.out.print("=>");
			
			str = cin.next();
			while(!book.setAuthor(str))
				str = cin.next();
			////////////////////////////////////////////
			
			System.out.println("�п�J�X���� :");
			System.out.print("=>");
			
			str = cin.next();
			while(!book.setPublisher(str))
				str = cin.next();
			/////////////////////////////////////////////
			
			System.out.println("�п�J�s�� :");
			System.out.print("=>");
			
			str = cin.next();
			while(!book.setNumber(str))
				str = cin.next();
			/////////////////////////////////////////////
			
			while(ter!=0)
			{
			System.out.println("�п�����O :");
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
				System.out.println("�ЦA��J�@��!");
				break;
			}
			}
			
			/////////////////////////////////////////////
			System.out.println("�п�J�~�� :");
			System.out.print("=>");
			
			str = cin.next();
			while(!book.setYear(str))
				str = cin.next();
			
			book_list.add(book);
			System.out.println("-------------------------");
			System.out.println("�s�W����");
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
			System.out.println("�п�ܭn�d�ߤ����(��J-1���}) :");
			System.out.println("A.�ѦW	 B.�@��  C.�X����  D.�s��");
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
					System.out.println("�п�J���d�ߤ����e");
					System.out.print("=> ");
					str = cin.next();
					System.out.println("------------------------------------------------------");
					System.out.println("�j�M���G");
					System.out.println("------------------------------------------------------");
					System.out.println("�ѦW    �@��    �X����   �s��     ����     �X���~��");
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
						System.out.println("�@��" + count + "����ƲŦX");
						System.out.println("------------------------------------------------------");
					ter=0;
					break;
				case"B":
					count=0;
					System.out.println("�п�J���d�ߤ����e");
					System.out.print("=> ");
					str = cin.next();
					System.out.println("------------------------------------------------------");
					System.out.println("�j�M���G");
					System.out.println("------------------------------------------------------");
					System.out.println("�ѦW    �@��    �X����   �s��     ����     �X���~��");
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
						System.out.println("�@��" + count + "����ƲŦX");
						System.out.println("------------------------------------------------------");
					ter=0;
					break;
				case"C":
					count=0;
					System.out.println("�п�J���d�ߤ����e");
					System.out.print("=> ");
					str = cin.next();
					System.out.println("------------------------------------------------------");
					System.out.println("�j�M���G");
					System.out.println("------------------------------------------------------");
					System.out.println("�ѦW    �@��    �X����   �s��     ����     �X���~��");
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
						System.out.println("�@��" + count + "����ƲŦX");
						System.out.println("------------------------------------------------------");
					ter=0;
					break;
				case"D":
					count=0;
					System.out.println("�п�J���d�ߤ����e");
					System.out.print("=> ");
					str = cin.next();
					System.out.println("------------------------------------------------------");
					System.out.println("�j�M���G");
					System.out.println("------------------------------------------------------");
					System.out.println("�ѦW    �@��    �X����   �s��     ����     �X���~��");
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
						System.out.println("�@��" + count + "����ƲŦX");
						System.out.println("------------------------------------------------------");
					ter=0;
					break;
				default:
					System.out.print("���~�A�Э��s��J��A���դ@��");
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
			
			System.out.println("     �ѦW   �@��   �X����   �s��      ����    �X���~��");
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
			System.out.println("�п�ܻݭn�ק蠟���y�Ƨ�(��J-1���}) : ");
			System.out.print("=> ");
			
			num = cin.nextInt();
			
			while(num>0&&num<book_list.size())
			{
				num = num-1;
			
				String id=null , str2=null;
				while(ter!=0)
				{
				System.out.println("�п�ܻݭn�ק蠟���");
				System.out.println("A.�ѦW	B.�@��	C.�X����");
				System.out.println("D.�s��	E.����	F.�X���~��");
				System.out.print("=> ");
				
				id = cin.next();
				switch(id)
				{
					case"A":
						ter=0;
						System.out.println("�п�J�s���ѦW");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setName(str2);
						break;
					case"B":
						ter=0;
						System.out.println("�п�J�s���@��");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setAuthor(str2);
						break;
					case"C":
						ter=0;
						System.out.println("�п�J�s���X����");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setPublisher(str2);
						break;
					case"D":
						ter=0;
						System.out.println("�п�J�s���s��");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setNumber(str2);
						break;
					case"E":
						ter=0;
						System.out.println("A.General 		B.Philosophy			C.Religion		D.Science");
						System.out.println("E.Math			F.Language			G.Art		");
						System.out.println("�п�ܱ��ק蠟����");
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
								System.out.print("�������~�A�ק異�ѡC�еy��A����...");
						}
						break;
					case"F":
						ter=0;
						System.out.println("�п�J�s���X���~��");
						System.out.print("=> ");
						str2 = cin.next();
						book_list.get(num).setYear(str2);
						break;
					default:
						System.out.print("���~�A�Э��s��J��A���դ@��!");
						break;
				}	
				}
				
			}
			
			pause();
			user();
			
		}
			
		public void title_set()throws Exception
		{
			if(name!=0)System.out.print("    �ѦW");
				else System.out.printf("       ");
			if(author!=0)System.out.print("   �@��");
				else System.out.printf("       ");
			if(publisher!=0)System.out.print("   �X����");
				else System.out.printf("	       ");
			if(number!=0)System.out.print("   �s��");
				else System.out.printf("	       ");
			if(type!=0)System.out.print("     ����");
				else System.out.printf("	    ");
			if(year!=0)System.out.print("     �X���~��");
				else System.out.printf("	  ");
			
		}
		
		public void delete()throws Exception
		{	
			int num=1;
			System.out.println("     �ѦW   �@��   �X����   �s��      ����    �X���~��");
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
			System.out.println("�п�J�ݭn�R�������y�Ƨ�(��J-1���}) : ");
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
				System.out.println("�R�����\");	
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
			System.out.println("�п����ܤ覡 (��J-1���}):");
			System.out.println("A.�������   B.�������");
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
						System.out.println("�п�ܱ���ܤ�����:");
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
								System.out.print("�������~�C�еy��A����...");
						}	
							System.out.println("------------------------------------------------------");
							System.out.println("�ѦW    �@��    �X����   �s��     ����     �X���~��");
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
	
				System.out.println("�п�ܱ��j�M������(��J-1���}) :");
				System.out.println("A.�]�� 	B.�۩w�q");
				System.out.print("=> ");
				id = cin.next();
			switch(id)
			{
				case"A":
					ter=0;
					display_all();
					System.out.println("�п�J���j�M�ѥ����Ƨ�:");
					System.out.print("=> ");
					
					
						num = cin.nextInt();
						if(num>book_list.size()) System.out.println("��J�Ƨǿ��~!");
					else
					{
						str = book_list.get(num-1).getName();
						search_for(str);
						System.out.println("-------------------------");
						System.out.println("�j�M����");
						System.out.println("-------------------------");
					}
					break;
				case"B":
					ter=0;
					System.out.println("�п�J���j�M�����e:");
					System.out.print("=> ");
					
					str = cin.next();
					
					search_for(str);
					System.out.println("-------------------------");
					System.out.println("�j�M����");
					System.out.println("-------------------------");
					break;
				case"-1":
					ter=0;
					break;
				default:
					System.out.println("-------------------------");
					System.out.println("�Э��s��J��A���դ@��");
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
			System.out.println("�O�_�O�s�ܧ�? (Y/N)");
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
				System.out.println("���~�A�Э��s��J��A���դ@��!");
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
				System.out.println("�ɮ׿򥢩ή榡���~�A�ЦA�դ@��!");
				System.out.print("--------------------------------");
				System.exit(0);
			}
			
			pw.println("------------------------------------------------------");
			pw.println("�ѦW    �@��    �X����   �s��     ����     �X���~��");
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
	System.out.print("��JEnter��^��W�@��...");
	try
	{
         	System.in.read();
	}
	catch(Exception e) {}
      }
		
		
}
