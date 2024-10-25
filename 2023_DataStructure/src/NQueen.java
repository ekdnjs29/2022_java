import java.util.ArrayList;

public class NQueen {
   
   static int count = 0;
   static int Nsize = 4;

    public static void main(String[] args) {
       NQueen chessBoard = new NQueen();
        chessBoard.dfsFunction(Nsize, 0, new ArrayList<Integer>());
        System.out.println("N = " + Nsize + " | CASE : " + chessBoard.count);
    }

    public void dfsFunction(int N, int currentRow, ArrayList<Integer> currentCandidate) {

        if(currentRow == N) {
           count ++;
            System.out.println(currentCandidate);
            return;
        }

        for(int column =0; column < N; column++) {
           
           // 현재 열과 행에 queen 을 배치할 수 있다면 (== true)
            if(this.isAvailable(currentCandidate, column)) {
               // 현재 행을 배열에 추가 (index가 열에 해당)
                currentCandidate.add(column);
                // 현재 열에 퀸을 찾으면 다음 열 검색
                this.dfsFunction(N, currentRow+1, currentCandidate); 
                // 가지치기
                currentCandidate.remove(currentCandidate.size() - 1);
            }
        }
    }

    public boolean isAvailable(ArrayList<Integer> candidate,int currentCol) {

        int currentRow = candidate.size();

        for(int i = 0; i < currentRow; i++) {
           //상위 노드의 퀸이 같은 행에 있거나 현재 노드의 퀸과 가로, 세로 거리가 같다면
            if (currentCol == candidate.get(i) || 
            		Math.abs(candidate.get(i) - currentCol) == currentRow - i) {
                //해가 아니므로 false를 반환한다
               return false;
            }
        }
        //해당되지 않으면 해가 맞으므로 true를 반환한다
        return true;
    }
}

