import java.util.LinkedList;
import java.util.List;

public class SmallestSubArray {
    public static <T> List<Range> findAll(Iterable<T> content, T[] terms) {
        List<Range> rangeList = new LinkedList<>();

        LinkedList<Integer>[] termsIndexes = new LinkedList[terms.length];
        for (int i = 0; i < terms.length; i++) {
            termsIndexes[i] = new LinkedList<>();
        }

        int smallestSize=Integer.MAX_VALUE;
        int leftPointer = 0;

        int index = 0;
        for (T contentPart : content) {
            boolean containsAll = true;
            for (int i = 0; i < terms.length; i++) {
                T currentTerm = terms[i];
                if (contentPart.equals(currentTerm)) {
                    termsIndexes[i].add(index);
                }
                if (termsIndexes[i].size() == 0) {
                    containsAll = false;
                }
            }
            if (containsAll) {
                while (containsAll) {
                    LinkedList<Integer> minimalList = termsIndexes[0];
                    for (int i = 1; i < terms.length; i++) {
                        LinkedList<Integer> currentList = termsIndexes[i];
                        if (currentList.get(0) < minimalList.get(0)) {
                            minimalList = currentList;
                        }
                    }
                    leftPointer = minimalList.removeFirst();

                    containsAll = minimalList.size() != 0;

                }
                Range range=new Range(leftPointer, index);
                if(range.size() < smallestSize){
                    smallestSize=range.size();
                    rangeList.clear();
                    rangeList.add(range);
                }else if(range.size()==smallestSize){
                    rangeList.add(range);
                }
            }
            index++;
        }

        return rangeList;
    }

    private static class Range {
        private final int start, end;

        public Range(int start, int end) {
            super();
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        public int size() {
            return end - start+1;
        }
    }
}
