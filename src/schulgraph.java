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
        }

}