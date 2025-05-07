import untils.*;
public class schulgraph {
    Graph schulgraph = new Graph();
    List<Vertex> Ergebnissliste = new List<>();
    List<Vertex> Ergebnisslistetf = new List<>();
    List<Vertex> neighbourstf = new List<>();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new schulgraph();
    }

    public schulgraph() {

        Vertex Informatikraum = new Vertex( "Inforaum");
        schulgraph.addVertex(Informatikraum);
        Vertex PZ = new Vertex( "PZ");
        schulgraph.addVertex(PZ);
        schulgraph.addEdge(new Edge(Informatikraum, PZ, 96));
        Vertex WC = new Vertex( "WC");
        schulgraph.addVertex(WC);
        schulgraph.addEdge(new Edge(Informatikraum, WC, 80));
         Vertex Aula = new Vertex( "Aula");
        schulgraph.addVertex(Aula);
        schulgraph.addEdge(new Edge(Informatikraum, Aula, 95));
        schulgraph.addEdge(new Edge(Aula, WC, 15));
        Vertex Kunstraum = new Vertex( "Kunstraum");
        schulgraph.addVertex(Kunstraum);
        schulgraph.addEdge(new Edge(Kunstraum, Aula, 71));
        schulgraph.addEdge(new Edge(Informatikraum, Kunstraum, 64));
        Vertex Musikraum = new Vertex( "Musikraum");
        schulgraph.addVertex(Musikraum);
        schulgraph.addEdge(new Edge(Informatikraum, Musikraum, 50));
        schulgraph.addEdge(new Edge(Musikraum, Kunstraum, 9));
        Vertex Informatikraum2 = new Vertex( "Inforaum2");
        schulgraph.addVertex(Informatikraum2);
        schulgraph.addEdge(new Edge(Musikraum, Informatikraum2, 55));
        schulgraph.addEdge(new Edge(Informatikraum, Kunstraum, 55));
        schulgraph.addEdge(new Edge(Informatikraum, Informatikraum2, 5));
        Vertex schulzoo= new Vertex( "schulzoo");
        schulgraph.addVertex(schulzoo);
        schulgraph.addEdge(new Edge(Informatikraum, schulzoo, 17));
        Vertex Chemieraum= new Vertex( "Chemieraum");
        schulgraph.addVertex(Chemieraum);
        schulgraph.addEdge(new Edge(Chemieraum, schulzoo, 7));
        Vertex Bioraum= new Vertex( "Bioraum");
        schulgraph.addVertex(Bioraum);
        schulgraph.addEdge(new Edge(Chemieraum, Bioraum, 4));
        Vertex Treppenhaus= new Vertex( "TreppenhausNW");
        schulgraph.addVertex(Treppenhaus);
        schulgraph.addEdge(new Edge(Chemieraum, Treppenhaus, 22));
        schulgraph.addEdge(new Edge(Treppenhaus, Bioraum, 21));
        schulgraph.addEdge(new Edge(Informatikraum, Treppenhaus, 13));
        Vertex Fussballplatz= new Vertex( "Fussballplatz");
        schulgraph.addVertex(Fussballplatz);
        schulgraph.addEdge(new Edge(Informatikraum, Fussballplatz, 34));
        Vertex Sporthalle= new Vertex( "Sporthalle");
        schulgraph.addVertex(Sporthalle);
        schulgraph.addEdge(new Edge(Informatikraum, Sporthalle, 95));
        schulgraph.addEdge(new Edge(Sporthalle, Fussballplatz, 38));
        Vertex TorSF= new Vertex( "TorSF");
        schulgraph.addVertex(TorSF);
        schulgraph.addEdge(new Edge(Sporthalle, TorSF, 63));
        schulgraph.addEdge(new Edge(TorSF, Fussballplatz, 34));
        Vertex Tischtennisplatten= new Vertex( "Tischtennisplatten");
        schulgraph.addVertex(Tischtennisplatten);
        schulgraph.addEdge(new Edge(TorSF, Tischtennisplatten, 8));
        schulgraph.addEdge(new Edge(Sporthalle, Tischtennisplatten, 28));
        Vertex Radkeller= new Vertex( "Radkeller");
        schulgraph.addVertex(Radkeller);
        schulgraph.addEdge(new Edge(Radkeller, PZ, 45));
        Vertex Sekreteriat = new Vertex( "Sekreteriat");
        schulgraph.addVertex(Sekreteriat);
        schulgraph.addEdge(new Edge(Sekreteriat, PZ, 37));
        Vertex Lehrerzimmer = new Vertex( "Lehrerzimmer");
        schulgraph.addVertex(Lehrerzimmer);
        schulgraph.addEdge(new Edge(Lehrerzimmer, PZ, 37));
        schulgraph.addEdge(new Edge(Sekreteriat, Lehrerzimmer, 18));
        schulgraph.addEdge(new Edge(Radkeller, Lehrerzimmer, 27));
        Vertex TorRH = new Vertex( "TorRH");
        schulgraph.addVertex(TorRH);
        schulgraph.addEdge(new Edge(TorRH, Lehrerzimmer, 79));
        schulgraph.addEdge(new Edge(TorRH, PZ, 98));
        schulgraph.addEdge(new Edge(TorRH, Sekreteriat, 78));
        Vertex Mensa = new Vertex( "Mensa");
        schulgraph.addVertex(Mensa);
        schulgraph.addEdge(new Edge(Lehrerzimmer,Mensa, 96));
        schulgraph.addEdge(new Edge(WC, Mensa, 22));
         Vertex Cafeteria = new Vertex( "Cafeteria");
        schulgraph.addVertex(Cafeteria);
        schulgraph.addEdge(new Edge(Cafeteria,Mensa, 7));
        schulgraph.addEdge(new Edge(Cafeteria,WC, 22));
        schulgraph.addEdge(new Edge(Cafeteria,Aula, 7));
        schulgraph.addEdge(new Edge(Cafeteria,Kunstraum, 90));
       // Breitensuche();
       // List();
            aufgabe();

    }
    public List Breitensuche(){
        Queue breitensuche = new Queue<>();
        Ergebnissliste.toFirst();
        while (Ergebnissliste.hasAccess()){
            Ergebnissliste.toFirst();
            Ergebnissliste.remove();
        }
      //  System.out.print("W");
        Ergebnissliste.toFirst();

        breitensuche.enqueue(schulgraph.getVertex("Inforaum"));
        schulgraph.getVertex("Inforaum").setMark(true);

        while (!breitensuche.isEmpty()){

            Vertex aktuelleNode = (Vertex)breitensuche.front();
            Ergebnissliste.append(aktuelleNode);
            breitensuche.dequeue();
            List<Vertex> neighbours = schulgraph.getNeighbours(aktuelleNode);
            neighbours.toFirst();
          //  System.out.print(Ergebnissliste.getContent().getID());

           while ( neighbours.hasAccess()){
               if(!neighbours.getContent().isMarked()){
                  // System.out.print("q");
                  // System.out.println(neighbours.getContent().getID());
                   breitensuche.enqueue(neighbours.getContent());
                   neighbours.getContent().setMark(true);

               }
               neighbours.next();
           }
        }
        return Ergebnissliste;

    }

    public void aufgabe(){
       List <Vertex> E = new List<>();
       E = Tiefensuchev();
       E.toFirst();
       while (E.hasAccess()) {
           System.out.println("+"+ E.getContent().getID());
           E.next();
       }
    }
    public void List(){

        Ergebnissliste = Breitensuche();
        Ergebnissliste.toFirst();
        while (Ergebnissliste.hasAccess()){
            System.out.print(Ergebnissliste.getContent().getID());
            List<Vertex> neighbours = new List<>();

                  neighbours =schulgraph.getNeighbours(Ergebnissliste.getContent());
                neighbours.toFirst();
            while(neighbours.hasAccess()){
                System.out.print(" ");
                System.out.print(schulgraph.getEdge(Ergebnissliste.getContent(), neighbours.getContent()).getWeight());
                System.out.print(neighbours.getContent().getID());
                neighbours.next();
            }
            //neighbours.remove();
            Ergebnissliste.next();
            System.out.println(" ");
        }
    }


        public int zahlen() {
        Ergebnissliste = Breitensuche();
        int i = 0;
        Ergebnissliste.toFirst();
        while (Ergebnissliste.hasAccess()){
            i++;
            Ergebnissliste.next();
        }
        return i;
        }

        public List Tiefensuchev()
        {
            Ergebnisslistetf.toFirst();
            while (Ergebnisslistetf.hasAccess()){
                Ergebnisslistetf.remove();
            }
            Ergebnisslistetf.toFirst();
            Tiefensuche(schulgraph.getVertex("Inforaum"));
            return Ergebnisslistetf;
        }
        public List Tiefensuche(Vertex pStart){

        if (!pStart.isMarked()) {
            Ergebnisslistetf.append(pStart);

            neighbourstf = schulgraph.getNeighbours(pStart);
            neighbourstf.toFirst();
            pStart.setMark(true);
            Tiefensuche(neighbourstf.getContent());
        }
        while(neighbourstf.hasAccess()) {
            neighbourstf.next();
            if(!neighbourstf.getContent().isMarked()){
                Ergebnisslistetf.append(pStart);
                neighbourstf = schulgraph.getNeighbours(pStart);
                neighbourstf.toFirst();

            }
        }
            return Ergebnisslistetf;
        }
}