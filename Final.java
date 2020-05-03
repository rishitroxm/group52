
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class AddData{ 
void add(){
 String newItem;
	ArrayList<String> list=new ArrayList<String>();
    list.add("item1:1000");
     list.add("item2:299");
      list.add("item3:345");

       list.add("item4  675");
        System.out.println(list.toString());
       
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the item you want to add:");
            newItem=sc.next();
           
       AddInFile(list,newItem);
       System.out.println("Added");
}
public static void writeToFile(ArrayList<String> list)
{
	try{
	   BufferedWriter writer=new BufferedWriter(new FileWriter("Expensee.txt"));
	   for(String x:list)
	   {
	     writer.write(x);
	     writer.newLine();
	   }
	   writer.close();
	} catch(IOException e)
	{
	  e.getStackTrace();
	}
}
    public static void AddInFile(ArrayList<String> list,String search)
    {
      
       {
         list.add(search);
         {
          
           writeToFile(list);
         }
       }  
            System.out.println(list.toString());
    }}  
     class UpdateData
{void update(){
	ArrayList<String> list=new ArrayList<String>();
      list.add("item1:1000");
      list.add("item2:299");
      list.add("item3:345");
      list.add("item4:675");
      System.out.println(list.toString());
       
      String item;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the item you want to update:");
      item=sc.next();
       UpdateInFile(list,item);
       System.out.println("Updated");
}
public static void writeToFile(ArrayList<String> list)
{
	try{
	   BufferedWriter writer=new BufferedWriter(new FileWriter("Expensee.txt"));
	   for(String x:list)
	   {
	     writer.write(x);
	     writer.newLine();
	   }
	   writer.close();
	} catch(IOException e)
	{
	  e.getStackTrace();
	}
}
    public static void UpdateInFile(ArrayList<String> list,String search)
    {
      String newItem;
       
      for(int i=0;i<list.size();i++)
       {
         if(list.get(i).equals(search))
         {
            list.remove(i);
            
             Scanner sc=new Scanner(System.in);
            System.out.println("enter the item you want to add:");
            newItem=sc.next();
           list.add(newItem);
           writeToFile(list);
         }
       }  
            System.out.println(list.toString());
    }  }
     class DeleteData
{void delete(){ 
 String olditem;
	ArrayList<String> list=new ArrayList<String>();
      list.add("item1:1000");
      list.add("item2:299");
      list.add("item3:345");
      list.add("item4:675");
      System.out.println(list.toString());
      Scanner sc=new Scanner(System.in);
            System.out.println("enter the item you want to Delete:");
            olditem=sc.next();
       deleteFromFile(list,olditem);
       System.out.println("Deleted");
}
public static void writeToFile(ArrayList<String> list)
{
	try{
	   BufferedWriter writer=new BufferedWriter(new FileWriter("Expensee.txt"));
	   for(String x:list)
	   {
	     writer.write(x);
	     writer.newLine();
	   }
	   writer.close();
	} catch(IOException e)
	{
	  e.getStackTrace();
	}
}
    public static void deleteFromFile(ArrayList<String> list,String search)
    {
       
       for(int i=0;i<list.size();i++)
       {
         if(list.get(i).equals(search))
         {
           list.remove(i);
           writeToFile(list);
         }
       }  
            System.out.println(list.toString());
    }  }
    class Final
    {
    public static void main(String args[])
    {
 String username, password;

        Scanner s = new Scanner(System.in);

        System.out.println("");
        System.out.println("============================================");
        
        System.out.println("-------Welcome To Expense Mangement--------");
        System.out.println("============================================");
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("---------------------------------------------");

        System.out.println("____________LOGIN DETAILS_____________");
        
        System.out.println("---------------------------------------------");
        System.out.println("");


        
        System.out.println("Enter username:");
        username = s.nextLine();
        
        System.out.println("Enter password:");
        password = s.nextLine();
       
        if(username.equals("Group52") && password.equals("Rishit"))
 {
            System.out.println("YES you are Successfully loged in");
            System.out.println(" you are a valube customer  ");
            System.out.println("                     ");
            System.out.println("            ");
            System.out.println("Dear Customer");
            System.out.println("Please choose one option Given below");
        }
       
        else
        {
            System.out.println("Authentication Failed");
        }
Scanner z=new Scanner(System.in);
    System.out.println("Press 1 if you want to add item");
	System.out.println("Press 2 if you want to update something");
	System.out.println("Press 3 if you want to delete something");
	System.out.println("press 4 to exit");
	int i;
	i=z.nextInt();
	if(i==1)
	{
	AddData p1=new AddData();
	p1.add();
	}
	if(i==2)
	{
	UpdateData p2=new UpdateData();
	p2.update();
	}
	if(i==3)
	{
	DeleteData p3=new DeleteData();
	p3.delete();
	}
	else
	{
		System.out.println("THank you !!!!!!!!!!!!!!!!!!");
		System.out.println("Hope we will meet again");
	System.exit(0);
	}
    }
    }