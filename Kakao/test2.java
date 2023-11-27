package Kakao;


import java.util.ArrayList;


public class test2 {
    public static void main(String[] args) {
        int[][] edges = {{4,11},{1,12},{8,3},{12,7},{4,2},{7,11},{4,8},{9,6},{10,11},{6,10},{3,5},{11,1},{5,3},{11,9},{3,8}};
        int[] answer = {};
        int graphsize =edges.length;
        ListGraph makegraph = new ListGraph(graphsize);
        for (int i = 0; i < edges.length; i++) {
            makegraph.put(edges[i][0],edges[i][1]);
        }
        makegraph.printGraph();

    }
}
class ListGraph{
    private static ArrayList<ArrayList<Integer>> graph;

    public ListGraph(int graphsize) {
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < graphsize +1; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    public  void put(int x, int y) {
        graph.get(x).add(y);
        graph.get(y).add(x);
    }
    public void printGraph(){
        for (int i = 0; i < graph.size(); i++) {
            System.out.println("정점" + i + "의 인접리스트");
            for (int j=0; j<graph.get(i).size(); j++){
                System.out.println("->" + graph.get(i).get(j));
            }
            System.out.println();
        }
    }
}
