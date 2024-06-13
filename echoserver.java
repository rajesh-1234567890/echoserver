import java.io.*; import java.net.*; 
public class echoserver {

public static void main(String args[])throws Exception {
ServerSocket m=null; 
Socket c=null;
DataInputStream usr_inp=null;
DataInputStream din=new DataInputStream(System.in); 
DataOutputStream dout=null; 
try
{
m=new ServerSocket(5678); 
c=m.accept();
usr_inp=new DataInputStream(c.getInputStream()); 
dout=new DataOutputStream(c.getOutputStream());
}
catch(IOException e) {}
if(c!=null || usr_inp!=null) {
String unip;
while(true)
{
System.out.println("\nMessage from Client..."); 
String m1=(usr_inp.readLine());
System.out.println(m1); 
dout.writeBytes(""+m1); 
dout.writeBytes("\n");
}
}
dout.close(); usr_inp.close(); c.close();
}
}
