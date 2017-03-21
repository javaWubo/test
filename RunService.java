package test;

/**
 * Created by 吴波 ;
 * Created on 2017/3/21.
 */
public class RunService {
    private static final int MAX_NUMBER = 1000;
    public ServiceResult make(int startId, int endId) {
        ServiceResult sr = new ServiceResult(1,"成功");
        int numberData = endId - startId+1;
        int indexOff =0;
        while (numberData/MAX_NUMBER>0) {
            indexOff = startId+MAX_NUMBER>endId ? endId:startId+MAX_NUMBER;
            boolean ret =  runMake(startId,indexOff);
            numberData = numberData-MAX_NUMBER;
            System.out.println(numberData+"-------numberData------------------");
            startId=indexOff;
        }
        if(numberData<MAX_NUMBER){
            runMake(startId,endId);
        }
        return sr;
    }

    private boolean runMake(int startId, int endId) {
        System.out.println(startId+" ~  "+endId);
        return true;
    }
}
