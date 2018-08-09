
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.tree.*;
class JTreeExample extends JFrame
{
    
JTree jt;
    JTextField jtf;
//JTree jt1,jt2,jt3;
//String[] data={"Item 1","Item 2","Item 3","Item 4","Item 5"};
//DefaultMutableTreeNode parent,i1,i2,i3,i4,i5;
//JScrollPane js1,js2,js3;

    public JTreeExample()
    {
        createAndShowGUI();
    }
   
    private void createAndShowGUI()
    {
        setTitle("JTree Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        DefaultMutableTreeNode self = new DefaultMutableTreeNode("SELF");
       // DefaultMutableTreeNode anode = new DefaultMutableTreeNode("RELIGION");
        //rootnode.add(anode);
        
        // becomes a file to rootnode
        // create ogames node add to the rootnode (becomes child node of rootnode)   
        DefaultMutableTreeNode religion      = new DefaultMutableTreeNode("RELIGION"); 
        DefaultMutableTreeNode relationships = new DefaultMutableTreeNode("RELATIONSHIPS");
            DefaultMutableTreeNode ourfamily = new DefaultMutableTreeNode("OUR FAMILY");
                     DefaultMutableTreeNode myparents =  new DefaultMutableTreeNode("My parents"); 
                     DefaultMutableTreeNode JijuAppa = new DefaultMutableTreeNode("Jiju & Aapa");
                     DefaultMutableTreeNode myselfMisses = new DefaultMutableTreeNode("Myself & Misses");
                     DefaultMutableTreeNode MamuAppa = new DefaultMutableTreeNode("Mamu & Appa");
                    // becomes a file to ourfamily
                     ourfamily.add(myparents);
                     // myparent is the child node to igames 
                     ourfamily.add(JijuAppa);
                   
                     ourfamily.add(myselfMisses);
                     // becomes a file to ourfamily
                     ourfamily.add(myselfMisses);
                     // becomes a file to ourfamily
                     ourfamily.add(MamuAppa);
          
            
            
            DefaultMutableTreeNode pil = new DefaultMutableTreeNode("PARENTS IN LAW");
            // becomes a file to relationships
                DefaultMutableTreeNode bhabi1 =  new DefaultMutableTreeNode("bhabi & Bro"); 
                DefaultMutableTreeNode bhabi2 = new DefaultMutableTreeNode("bhabhi2 & bro");
                        DefaultMutableTreeNode bhabhi2_child1 = new DefaultMutableTreeNode("baajaani");
                        DefaultMutableTreeNode bhabhi2_child2 = new DefaultMutableTreeNode("gaouse");
                        // becomes a file to snode
                        bhabi2.add(bhabhi2_child1);
                        // becomes a file to snode 
                         bhabi2.add(bhabhi2_child2);
                DefaultMutableTreeNode shakira = new DefaultMutableTreeNode("shakira & myself");
                DefaultMutableTreeNode maqbool =  new DefaultMutableTreeNode("saale saab"); 
                DefaultMutableTreeNode nasreen = new DefaultMutableTreeNode("saali1");
                DefaultMutableTreeNode parveen = new DefaultMutableTreeNode("saali2");
                    // becomes a file to snode
                    pil.add(bhabi1);
                    // becomes a file to snode 
                    pil.add(bhabi2);
                    // snode is the child node to igames 
                    pil.add(shakira); 
                    // becomes a file to snode
                    pil.add(maqbool);
                    // becomes a file to snode 
                    pil.add(nasreen);
                    // snode is the child node to igames 
                    pil.add(parveen); 
            
            religion.add(relationships);
            // becomes a file to relationships
            
            
            
            relationships.add(ourfamily);
             
            relationships.add(pil);
        
        
        DefaultMutableTreeNode islamicknowledge = new DefaultMutableTreeNode("ISLAMIC KNOWLEDGE"); 
                DefaultMutableTreeNode readboooks =  new DefaultMutableTreeNode("Read Books"); 
                DefaultMutableTreeNode ltb = new DefaultMutableTreeNode("Listen to Bayaan");
       
                // becomes a file to snode
                religion.add(islamicknowledge);
                // becomes a file to snode 
                islamicknowledge.add(readboooks);
                // snode is the child node to igames 
                islamicknowledge.add(ltb);
        
        
        
        DefaultMutableTreeNode namaz = new DefaultMutableTreeNode("NAMAZ");
                DefaultMutableTreeNode fajar =  new DefaultMutableTreeNode("FAJAR"); 
                DefaultMutableTreeNode zohar = new DefaultMutableTreeNode("ZOHAR");
                DefaultMutableTreeNode asar = new DefaultMutableTreeNode("ASAR");
                DefaultMutableTreeNode magrib = new DefaultMutableTreeNode("MAGRIB");
                DefaultMutableTreeNode eesha = new DefaultMutableTreeNode("EESHA");
                // becomes a file to religion
                religion.add(namaz);
                // becomes a file to namaz
                namaz.add(fajar);
                    DefaultMutableTreeNode NO_OF_RAKATS_FAJR =  new DefaultMutableTreeNode("2,2");
                     fajar.add(NO_OF_RAKATS_FAJR);
                // snode is the child node to namaz 
                namaz.add(zohar);
                    DefaultMutableTreeNode NO_OF_RAKATS_zohar =  new DefaultMutableTreeNode("4,4,2,2");
                     zohar.add(NO_OF_RAKATS_zohar);
                namaz.add(asar);
                        DefaultMutableTreeNode NO_OF_RAKATS_asar =  new DefaultMutableTreeNode("4,4");
                     asar.add(NO_OF_RAKATS_asar);
                // snode is the child node to namaz 
                namaz.add(magrib);
                        DefaultMutableTreeNode NO_OF_RAKATS_magrib =  new DefaultMutableTreeNode("3,2,2");
                     magrib.add(NO_OF_RAKATS_magrib);
                     namaz.add(eesha);
                            DefaultMutableTreeNode NO_OF_RAKATS_eesha =  new DefaultMutableTreeNode("4,4,2,2,3,2");
                     eesha.add(NO_OF_RAKATS_eesha);
        religion.add(relationships); 
        // becomes file to ogames 
        religion.add(islamicknowledge); 
        // becomes file to ogames s
        religion.add(namaz);
        // becomes file to ogames 
        self.add(religion);
        // add ogames to rootnode
        // create igames node add to the rootnode(becomes child node of rootnode) 
        DefaultMutableTreeNode work = new DefaultMutableTreeNode("WORK");
            DefaultMutableTreeNode personalwork = new DefaultMutableTreeNode("PERSONAL WORK");
                DefaultMutableTreeNode morning =  new DefaultMutableTreeNode("MORNING"); 
                DefaultMutableTreeNode night = new DefaultMutableTreeNode("NIGHT");
                DefaultMutableTreeNode otherActivites =  new DefaultMutableTreeNode("OTHER ACTIVITES"); 
                        DefaultMutableTreeNode Dairy =  new DefaultMutableTreeNode("Dairy"); 
                        DefaultMutableTreeNode charging = new DefaultMutableTreeNode("charging");
                        DefaultMutableTreeNode declutter = new DefaultMutableTreeNode("Declutter");
                        DefaultMutableTreeNode reading = new DefaultMutableTreeNode("Reading");
                        DefaultMutableTreeNode Exercise = new DefaultMutableTreeNode("Exercise");
                        // becomes a file to snode
                       otherActivites.add(Dairy);
                        // becomes a file to snode 
                        otherActivites.add(charging);
                        // snode is the child node to igames 
                        otherActivites.add(declutter); 
                
                        otherActivites.add(reading); 
                        otherActivites.add(Exercise); 
                
                DefaultMutableTreeNode mythings = new DefaultMutableTreeNode("MY THINGS");
                    DefaultMutableTreeNode clothes =  new DefaultMutableTreeNode("clothes"); 
                    DefaultMutableTreeNode books = new DefaultMutableTreeNode("Books");
                    DefaultMutableTreeNode bike = new DefaultMutableTreeNode("Bike");
                            DefaultMutableTreeNode electronics = new DefaultMutableTreeNode("eDevices");
                            DefaultMutableTreeNode laptop = new DefaultMutableTreeNode("laptop");
                            DefaultMutableTreeNode kindle = new DefaultMutableTreeNode("kindle");
                            DefaultMutableTreeNode mobile = new DefaultMutableTreeNode("mobile"); 
                            
                            
                            electronics.add(laptop);
                            // snode is the child node to igames 
                            electronics.add(kindle); 
                            electronics.add(mobile);
                            // becomes a file to snode
                    mythings.add(clothes);
                    // becomes a file to snode 
                    mythings.add(books);
                    // snode is the child node to igames 
                    mythings.add(bike); 
                     mythings.add(electronics); 
                
                
                
                
                
                DefaultMutableTreeNode systemwork = new DefaultMutableTreeNode("SYSTEM WORK");
                 
                 // snode is the child node to personal  
                work.add(personalwork);
               // snode is the child node to personal
                personalwork.add(morning);
                // becomes a file to personalwork
                personalwork.add(night); 
                // becomes a file to personalwork
                
                personalwork.add(otherActivites);
                // becomes a file to personalWORK 
                personalwork.add(mythings);
                // becomes a file to PERSONALwork 
                personalwork.add(systemwork);
                
      
        
        DefaultMutableTreeNode officework = new DefaultMutableTreeNode("OFFICE WORK");
                DefaultMutableTreeNode OD =  new DefaultMutableTreeNode("OD"); 
                        DefaultMutableTreeNode MOT =  new DefaultMutableTreeNode("ModeOfTravel"); 
                        DefaultMutableTreeNode ActualTask = new DefaultMutableTreeNode("ActualTask");
                        DefaultMutableTreeNode Luggage = new DefaultMutableTreeNode("Luggage");
                        DefaultMutableTreeNode PIC = new DefaultMutableTreeNode("PeopleInContact");
                        DefaultMutableTreeNode exp = new DefaultMutableTreeNode("Expenditure"); 
                        // becomes a file to snode
                        OD.add(MOT);
                        // becomes a file to snode 
                        OD.add(ActualTask);
                        // snode is the child node to igames 
                        OD.add(Luggage);
                        OD.add(PIC);
                        // snode is the child node to igames 
                        OD.add(exp);
                
                
                
                
                
                
                
                
                DefaultMutableTreeNode SystemSoftwares = new DefaultMutableTreeNode("System and Softwares");
                    DefaultMutableTreeNode Autocadd =  new DefaultMutableTreeNode("Autocadd"); 
                    DefaultMutableTreeNode Epanet = new DefaultMutableTreeNode("Epanet");
                    DefaultMutableTreeNode MsOffice = new DefaultMutableTreeNode("MsOffice");
                    DefaultMutableTreeNode googleearth = new DefaultMutableTreeNode("GoogleEarth");
                    // becomes a file to snode
                    SystemSoftwares.add(Autocadd);
                    // becomes a file to snode 
                    SystemSoftwares.add(Epanet);
                    // snode is the child node to igames 
                    SystemSoftwares.add(MsOffice);
                    SystemSoftwares.add(googleearth);
                
                
                
                
                
                
                
                DefaultMutableTreeNode company = new DefaultMutableTreeNode("COMPANY");
                     DefaultMutableTreeNode staff =  new DefaultMutableTreeNode("staff"); 
                     DefaultMutableTreeNode ToCordinate = new DefaultMutableTreeNode("ToCoordinateWith");
                     DefaultMutableTreeNode Others = new DefaultMutableTreeNode("Others");
                     // becomes a file to snode
                        company.add(staff);
                        // becomes a file to snode 
                                 company.add(ToCordinate);
                        // snode is the child node to igames 
                                company.add(Others); 
                    
                
                
                
                
                
                
                DefaultMutableTreeNode Actualwork = new DefaultMutableTreeNode("ActualWork");
                DefaultMutableTreeNode placePosition= new DefaultMutableTreeNode("place");
                
                
                // becomes a file to snode
                work.add(officework);
                // becomes a file to snode 
                officework.add(SystemSoftwares);
                // snode is the child node to igames 
                officework.add(company); 
                officework.add(Actualwork);
                // snode is the child node to igames 
                officework.add(placePosition); 
                
                officework.add(OD);
        
        
        
        
        
        work.add(personalwork);
        // becomes file to igames 
        work.add(officework);
        // becomes file to igames 
        self.add(work); 
        // add igames to rootnode 
        // this node becomes child node to igames   
        DefaultMutableTreeNode snode =  new DefaultMutableTreeNode("Skill Games"); 
        DefaultMutableTreeNode shnode = new DefaultMutableTreeNode("Shooting");
        DefaultMutableTreeNode banode = new DefaultMutableTreeNode("Bar Dancing");
         // becomes a file to snode
        work.add(snode);
        // becomes a file to snode 
        snode.add(banode);
        // snode is the child node to igames 
        snode.add(shnode); 
        
        
        
        DefaultMutableTreeNode bias1 = new DefaultMutableTreeNode("BIAS");
        DefaultMutableTreeNode caste1 = new DefaultMutableTreeNode("CASTE");
        DefaultMutableTreeNode gender1 = new DefaultMutableTreeNode("GENDER");
        DefaultMutableTreeNode locality1 = new DefaultMutableTreeNode("LOCALITY");
        DefaultMutableTreeNode colour = new DefaultMutableTreeNode("COLOUR");
         // becomes file to BIAS 
        bias1.add(locality1);
        bias1.add(colour);
        // becomes file to bias
        // becomes file to BIAS 
        bias1.add(caste1);
        // becomes file to BIAS 
        bias1.add(gender1);
        // becomes file to bias 
        self.add(bias1); 
        // add igames to rootnode 
        DefaultMutableTreeNode  time = new DefaultMutableTreeNode("TIME");
        DefaultMutableTreeNode day = new DefaultMutableTreeNode("DAY");
            
                 DefaultMutableTreeNode hours =  new DefaultMutableTreeNode("hours"); 
                DefaultMutableTreeNode min = new DefaultMutableTreeNode("minutes");
                 DefaultMutableTreeNode sec = new DefaultMutableTreeNode("seconds");
                 // becomes a file to snode
                 day.add(hours);
                // becomes a file to snode 
                 day.add(min);
                // snode is the child node to igames 
                day.add(sec); 
        DefaultMutableTreeNode week = new DefaultMutableTreeNode("WEEK");
                     DefaultMutableTreeNode su =  new DefaultMutableTreeNode("sunday"); 
                    DefaultMutableTreeNode  mo = new DefaultMutableTreeNode("monday");
                     DefaultMutableTreeNode tu = new DefaultMutableTreeNode("tuesday");
                    DefaultMutableTreeNode  wd =  new DefaultMutableTreeNode("wednesday"); 
                    DefaultMutableTreeNode  th = new DefaultMutableTreeNode("thrusday");
                     DefaultMutableTreeNode fr = new DefaultMutableTreeNode("friday");
                     DefaultMutableTreeNode sa = new DefaultMutableTreeNode("saterday");
                     
                     
                     // becomes a file to snode
                     week.add(su);
                    // becomes a file to snode 
                     week.add(mo);
                     // snode is the child node to igames 
                     week.add(tu); 
                     week.add(wd);
                     // becomes a file to snode 
                     week.add(th);
                     // snode is the child node to igames 
                    week.add(fr);
                    week.add(sa);
        
        DefaultMutableTreeNode month= new DefaultMutableTreeNode("MONTH");
            DefaultMutableTreeNode wk1 =  new DefaultMutableTreeNode("week1"); 
            DefaultMutableTreeNode wk2 = new DefaultMutableTreeNode("week2");
            DefaultMutableTreeNode wk3 = new DefaultMutableTreeNode("week3");
            DefaultMutableTreeNode wk4 = new DefaultMutableTreeNode("week4");
            // becomes a file to snode
             month.add(wk1);
            // becomes a file to snode 
            month.add(wk2);
            // snode is the child node to igames 
            month.add(wk3);
            month.add(wk4); 
        
        
        
        
        
        DefaultMutableTreeNode   year= new DefaultMutableTreeNode("YEAR");
                    DefaultMutableTreeNode win =  new DefaultMutableTreeNode("winter"); 
                        DefaultMutableTreeNode jan = new DefaultMutableTreeNode("jan");
                        DefaultMutableTreeNode feb = new DefaultMutableTreeNode("feb");
                        DefaultMutableTreeNode mar = new DefaultMutableTreeNode("mar");
                         // becomes a file to snode
                        win.add(jan);
                        // becomes a file to snode 
                        win.add(feb);
                        // snode is the child node to igames 
                        win.add(mar);
                    
                    
                    DefaultMutableTreeNode sum = new DefaultMutableTreeNode("summer");
                            DefaultMutableTreeNode apr = new DefaultMutableTreeNode("april");
                            DefaultMutableTreeNode may = new DefaultMutableTreeNode("may");
                            DefaultMutableTreeNode jun = new DefaultMutableTreeNode("june");
                            // becomes a file to snode
                            sum.add(apr);
                            // becomes a file to snode 
                            sum.add(may);
                            // snode is the child node to igames 
                            sum.add(jun);
                    
                    
                    
                    
                    
                    DefaultMutableTreeNode rain = new DefaultMutableTreeNode("rain");
                            DefaultMutableTreeNode jul = new DefaultMutableTreeNode("july");
                            DefaultMutableTreeNode aug = new DefaultMutableTreeNode("august");
                            DefaultMutableTreeNode sep = new DefaultMutableTreeNode("september");
                            // becomes a file to snode
                            rain.add(jul);
                            // becomes a file to snode 
                            rain.add(aug);
                            // snode is the child node to igames 
                            rain.add(sep);
                    
                    
                    
                    
                    DefaultMutableTreeNode aut = new DefaultMutableTreeNode("autumn");
                            DefaultMutableTreeNode oct = new DefaultMutableTreeNode("october");
                            DefaultMutableTreeNode nov = new DefaultMutableTreeNode("november");
                            DefaultMutableTreeNode dec = new DefaultMutableTreeNode("december");
                            // becomes a file to snode
                            aut.add(oct);
                            // becomes a file to snode 
                            aut.add(nov);
                            // snode is the child node to igames 
                            aut.add(dec);
                              
                    
                    
                    
                    // becomes a file to snode
                     year.add(win);
                    // becomes a file to snode 
                    year.add(sum);
                    // snode is the child node to igames 
                    year.add(rain);
                     year.add(aut);
        
        
        
        // becomes file to time 
        time.add(day);
        // becomes file to time 
        time.add(week);
        // becomes file to time 
        time.add(month);
        // becomes file to bias 
         // becomes file to time 
        time.add(year);
        self.add(time); 
        
        DefaultMutableTreeNode  place = new DefaultMutableTreeNode("PLACE");
        DefaultMutableTreeNode  home = new DefaultMutableTreeNode("HOME");
        DefaultMutableTreeNode  masjid = new DefaultMutableTreeNode("MASJID");
        DefaultMutableTreeNode  office = new DefaultMutableTreeNode("OFFICE");
         DefaultMutableTreeNode library = new DefaultMutableTreeNode("LIBRARY");
         // becomes file to place 
        place.add(home);
        // becomes file to place 
        place.add(masjid);
        // becomes file to place
        place.add(office);
               // becomes file to place 
        place.add(library);
        self.add(place); 
        DefaultMutableTreeNode  financial = new DefaultMutableTreeNode("FINANCIAL");
        DefaultMutableTreeNode  income = new DefaultMutableTreeNode("INCOME");
        DefaultMutableTreeNode expenditure = new DefaultMutableTreeNode("EXPENDITURE");
        DefaultMutableTreeNode savings = new DefaultMutableTreeNode("SAVINGS");
           
        
        
        financial.add(savings);
        // becomes file to financial 
       financial.add(income);
        // becomes file to financial 
       financial.add(expenditure);
        // becomes file to financial
        financial.add(savings);
      DefaultMutableTreeNode ubiaccount = new DefaultMutableTreeNode("ubiAccount");
        DefaultMutableTreeNode sbiaccount = new DefaultMutableTreeNode("sbiAccount");
        DefaultMutableTreeNode Syndaccount = new DefaultMutableTreeNode("syndAccount");
        savings.add(ubiaccount);
        // becomes file to financial 
       savings.add(sbiaccount);
        savings.add(Syndaccount);
        // becomes file to financial
        
        
        
        self.add(financial); 
        
        DefaultMutableTreeNode  Bankfacilities = new DefaultMutableTreeNode("Banking");
        DefaultMutableTreeNode Mobilebanking = new DefaultMutableTreeNode("Mobilebanking");
        DefaultMutableTreeNode InternetBanking = new DefaultMutableTreeNode("InternetBanking");
        DefaultMutableTreeNode ATM = new DefaultMutableTreeNode("Atm");
           
         financial.add(Bankfacilities);
             Bankfacilities.add( Mobilebanking);
             Bankfacilities.add( InternetBanking);
             Bankfacilities.add( ATM);
        jt = new JTree(self); 
        // add root node to the JTree 
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED; 
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jt , v , h);   
        add(jsp, "Center"); 
        // add scroll pane to the container 
        jtf = new JTextField(20); 
        add( jtf, "South");   
        //jt.addMouseListener(new MouseAdapter() {@Override
         //   public void mouseClicked(MouseEvent e){ display(e);} }) ;
           // }
        /*public void display(MouseEvent e) {
            TreePath tp = jt.getPathForLocation(e.getX(), e.getY());
        if( tp != null) jtf.setText(tp.toString()); else jtf.setText(""); 
        }*/
        
         setSize(100,1000);
        setVisible(true);
}
    
    public static void main(String args[])
    {
        new JTreeExample();
    }
}
        
       /* setLayout(new GridLayout(2,3));
        
        
       
        jt1=new JTree();
       
        js1=new JScrollPane(jt1);
       
        add(js1);
       
        // Without any root but given data
        jt2=new JTree(data);
       
        // Create JScrollPane for jt2
        js2=new JScrollPane(jt2);
       
        // add js2
        add(js2);
       
        // The parent node contains children (aka sub-nodes)
        parent=new DefaultMutableTreeNode("Parent node");
       
        // These are good, they love children but they
        // haven't
        // They are just leaves, they don't have sub-nodes (a.k.a children)
        i1=new DefaultMutableTreeNode("Item 1!");
        i2=new DefaultMutableTreeNode("Item 2!");
        i3=new DefaultMutableTreeNode("Item 3!");
        i4=new DefaultMutableTreeNode("Item 4!");
       
        // If false, i5 doesn't allow children, may be
        // it did family planning operation!! ;)
        // default is true
        i5=new DefaultMutableTreeNode("Final Item",false);
       
        // Add a sub item to i1
        i1.add(new DefaultMutableTreeNode("Sub item 1"));
       
        // Add children to parents
        parent.add(i1);
        parent.add(i2);
        parent.add(i3);
        parent.add(i4);
        parent.add(i5);
       
        // A jtree with parent
        // Here parent is only one, he is root too!!
        jt3=new JTree(parent);
       
        js3=new JScrollPane(jt3);
       
        add(js3);
       
        setSize(400,400);
        setVisible(true);
    }
   
    public static void main(String args[])
    {
        new JTreeExample();
    }
}

/*
 * 
 * 
 * *//*
 * import javax.swing.*;

 *   import java.applet.*;

//not required as JApplet extends Applet 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.* ;
import javax.swing.tree.* ;

// for DefaultMutableTreeNode and JTree   
public class JTreeDemo extends JApplet {
    
    public void init() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); 
        
        // this is the root node and top in the hierarchy 
        
}
 */
 
 