package Saturn.domain_models;

/*Generated by MPS */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileNotFoundException;

public class Saturn_4_handler {

  public static String EVENT_B_MODELS_DIR_NAME = "Event_B_Models/";
  public static String EVENT_B_MODELS_FILE_EXTENSION = ".sys";
  public static String GRAPH_FILE_EXTENSION = ".puml";


  public static void main(String[] args) {


    File eventBModelFile = new File(new File(Saturn_4_handler.class.getProtectionDomain().getCodeSource().getLocation().getFile()).getParentFile(), EVENT_B_MODELS_DIR_NAME + "Saturn_4" + EVENT_B_MODELS_FILE_EXTENSION);
    File graphFile = new File(new File(Saturn_4_handler.class.getProtectionDomain().getCodeSource().getLocation().getFile()).getParentFile(), EVENT_B_MODELS_DIR_NAME + "Saturn_4" + GRAPH_FILE_EXTENSION);

    if (!(eventBModelFile.getParentFile().exists())) {
      eventBModelFile.getParentFile().mkdirs();
    }
    if (eventBModelFile.exists()) {
      eventBModelFile.delete();
      graphFile.delete();
    }
    try {
      eventBModelFile.createNewFile();
      graphFile.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }




    System.out.println("Path to Event-B Model File corresponding to " + "Saturn_4" + " : " + eventBModelFile);
    System.out.println("Path to graph File corresponding to " + "Saturn_4" + " : " + graphFile);

    try {
      PrintWriter pw = new PrintWriter(eventBModelFile);
      PrintWriter pwGraph = new PrintWriter(graphFile);



      pw.println("/* " + "Saturn_4" + "\n* Author: SysML/KAOS Domain Model Parser\n* Creation date: " + new SimpleDateFormat("dd/MM/yyyy").format(new Date()) + "\n*/");
      pw.println("\nREFINEMENT\nSaturn_4");
      pw.println("REFINES\nSaturn_3");

      pw.println("\nSETS");
      pw.println("MI; MO; TT");

      pw.println("\nCONSTANTS");
      pw.println("agents_in, agents_out, VIN, s_in_r, VOUT, s_out_r, vec_to_in, vec_to_out, VBF");

      pw.println("\nVARIABLES");
      pw.println("s_in_l, s_out_l");

      pw.println("\nPROPERTIES");
      pw.println("agents_in <: MI &\nagents_out <: MO &\nVIN : agents_in >-> TT &\ns_in_r : VIN &\nVOUT : agents_out >-> TT &\ns_out_r : VOUT &\nvec_to_in : VIN >-> T_IN &\ns_in_l |-> in_l : vec_to_in &\ns_in_r |-> in_r : vec_to_in &\nvec_to_out : VOUT >-> T_OUT &\ns_out_l |-> out_l : vec_to_out &\ns_out_r |-> out_r : vec_to_out &\nVBF : VIN --> VOUT &\n//logical formula p1\n(agents_in /=  {} ) &\n//logical formula p2\n(agents_out /=  {} ) &\n//logical formula p3\n(ran(vec_to_out) <: ran(FB)) &\n//logical formula P4\n(VBF = (vec_to_in;FB;vec_to_out~ ) )");

      pw.println("\nINVARIANT");
      pw.println("s_in_l : VIN &\ns_out_l : VOUT &\ns_in_l |-> in_l : vec_to_in &\ns_in_r |-> in_r : vec_to_in &\ns_out_l |-> out_l : vec_to_out &\ns_out_r |-> out_r : vec_to_out");

      pw.println("\nINITIALISATION");
      pw.println("s_in_l :: VIN ||\ns_out_l :: VOUT");


      pw.println("\n\nEND");
      pw.close();

      pwGraph.println("@startuml");

      pwGraph.println("\nskinparam class {\n BackgroundColor<<association>> Darkorange \n BackgroundColor<<concept>>  Snow \n} ");



      pwGraph.println("package Saturn_3  <<Folder>> {\n}");


      pwGraph.println("package " + "Saturn_4" + " <<Folder>> {");

      pwGraph.println("	class \"Saturn_1/T_IN\" as T_IN <<concept>> \n	class \"Saturn_1/T_OUT\" as T_OUT <<concept>> \n	class MI <<concept>>  {\n	}\n	class MO <<concept>>  {\n	}\n	class agents_in <<concept>>  {\n	}\n	MI <|-- agents_in\n	class agents_out <<concept>>  {\n	}\n	MO <|-- agents_out\n	class TT <<concept>>  {\n	}");


      pwGraph.println("	agents_in \"0..1\" -- \"1\" TT : > \n	 (agents_in, TT) .. VIN\n	 class VIN <<association>>  {\n	}\n	 object s_in_l <<maplet>>  <<variable>> \n	VIN *-- s_in_l : individualOf \n	 object s_in_r <<maplet>> \n	VIN *-- s_in_r : individualOf \n	agents_out \"0..1\" -- \"1\" TT : > \n	 (agents_out, TT) .. VOUT\n	 class VOUT <<association>>  {\n	}\n	 object s_out_l <<maplet>>  <<variable>> \n	VOUT *-- s_out_l : individualOf \n	 object s_out_r <<maplet>> \n	VOUT *-- s_out_r : individualOf \n	VIN \"0..1\" -- \"1\" T_IN : vec_to_in > \n	VOUT \"0..1\" -- \"1\" T_OUT : vec_to_out > \n	VIN \"*\" -- \"1\" VOUT : VBF > ");

      pwGraph.println("}");

      pwGraph.println("Saturn_3 <|-- Saturn_4");


      pwGraph.println("@enduml");
      pwGraph.close();


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }



  }
}