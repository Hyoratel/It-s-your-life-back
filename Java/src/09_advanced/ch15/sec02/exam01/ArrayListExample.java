package ch15.sec02.exam01;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 인스턴스 생성
        ArrayList<Board> list = new ArrayList<>();

        //인스턴스 5개 생성
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));

        //ArrayList에 저장된 요소 개수 출력
        System.out.println("총 개체 수: "+list.size());

        System.out.println();
        //3번째 데이터를 추출하여 출력
        Board board = list.get(2); //인덱스 번호
        System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());

        System.out.println();
        //for문으로 리스트 각 요소 출력
        for(int i=0; i<list.size(); i++) {
            Board board2 = list.get(i);
            System.out.println(board2.getSubject()+"\t"+board2.getContent()+"\t"+board2.getWriter());
        } //for

        //인덱스 2에 해당하는 요소 제거 *2
        System.out.println();
        list.remove(2);
        list.remove(2);

        //향상된 for문으로 순회 출력
        for(Board board2 : list) {
            System.out.println(board2.getSubject()+"\t"+board2.getContent()+"\t"+board2.getWriter());
        }
    }
}
