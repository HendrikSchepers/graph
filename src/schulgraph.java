import untils.*;
public class schulgraph {
    Graph schulgraph = new Graph();
    List <Vertex> Ergebnissliste = new List<>();
    public static void main(String[] args) {
        System.out.println("Hello world!");
            new schulgraph();
    }

        public schulgraph () {

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
        Breitensuche();
        List();

    }
    public List Breitensuche(){
        Queue breitensuche = new Queue<>();

        Ergebnissliste.toFirst();
        breitensuche.enqueue(schulgraph.getVertex("Informatikraum"));
        while (!breitensuche.isEmpty()){
            Vertex aktuelleNode = (Vertex)breitensuche.front();
            breitensuche.dequeue();
            Ergebnissliste.append(aktuelleNode);
            List<Vertex> neighbours = schulgraph.getNeighbours(aktuelleNode);
            neighbours.toFirst();
           while ( neighbours.hasAccess()){
               if(!neighbours.getContent().isMarked()){
                   breitensuche.enqueue(neighbours.getContent());
                   neighbours.getContent().setMark(true);
                   neighbours.next();
               }
           }
        }
        return Ergebnissliste;
    }
    public List List(){
        Breitensuche();
        Ergebnissliste.toFirst();
        while (Ergebnisslist.hasAccess()){
            System.out.print(Ergebnissliste.getContent());
            List<Vertex> neighbours = schulgraph.getNeighbours(Ergebnissliste.getContent());
            while(neighbours.hasAccess()){
                system.out.print(neihbours.getContent());
                neighbours.next();
            }
            System.out.println(" ");
        }
    }
}
