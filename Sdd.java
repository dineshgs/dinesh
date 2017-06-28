import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class Sdd {
	int v1,v2,wt; 
}
class kruskal
{
public static void main(String args[])throws IOException 
{ 

int a,j,min=0;
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
System.out.println(" Enter no.of vertices:");
int v=Integer.parseInt(br.readLine());
System.out.println(" Enter no.of e:");
int e=Integer.parseInt(br.readLine());
 Sdd ed[]=new Sdd[e+1];
for(a=1;a<=e;a++)
{
 ed[a]=new Sdd();
 System.out.println(" Enter the vertices and the weight of e "+(a)+ ":"); 
 ed[a].v1=Integer.parseInt(br.readLine());
 ed[a].v2=Integer.parseInt(br.readLine());
 ed[a].wt=Integer.parseInt(br.readLine());
}
for(a=1;a<=e;a++)      
 for(j=1;j<=e-1;j++)
{
 if(ed[j].wt>ed[j+1].wt)
 {
   Sdd t=new Sdd();
    t=ed[j];
    ed[j]=ed[j+1];
    ed[j+1]=t;
}
}

int visited[]=new int[v+1];   
for(a=1;a<=v;a++)
 visited[a]=0;
System.out.println("MINIMUM SPANNING TREE :");


for(a=1;a<=e;a++)
{ 
 if(a>v)
  break;
else if( visited[ed[a].v1]==0 || visited[ed[a].v2]==0)
 {
    System.out.println(ed[a].v1+ "-"+ ed[a].v2);
    visited[ed[a].v1]=visited[ed[a].v2]=1;
    min+=ed[a].wt;
 }
}
System.out.println("MINIMUM COST = " +min);
}
}
