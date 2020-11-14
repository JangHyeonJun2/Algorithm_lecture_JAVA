package doit_Algorithm.검색알고리즘.클래스메서드와인스턴스메서드;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return name + " " + height + " " + vision;
        }

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {

                return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
            }
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("김한결",162,0.3),
                new PhyscData("유지훈",167,0.4),
                new PhyscData("이나령",169,0.1),
                new PhyscData("홍준기",170,1.0),
                new PhyscData("진서현",184,0.9),
                new PhyscData("장현준",154,0.9),
        };

        System.out.print("몇 cm인 사람을 찾고 있나요? : ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(x,new PhyscData("",height,0.0),PhyscData.HEIGHT_ORDER);

        if (idx < 0)
            System.out.println("요소가 없습니다.");
        else{
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
