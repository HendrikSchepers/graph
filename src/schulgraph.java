import utils.*;
public class schulgraph {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

        public schulgraph () {
        Graph schulgraph = new Graph();
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
        Vertex Tischtennisplatten= new Vertex( "Tischtennisplatten);
        schulgraph.addVertex(Tischtennisplatten);

    }

}