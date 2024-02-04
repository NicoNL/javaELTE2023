package LAB8.worker.schedule;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;

public class WorkerSchedule 
{
    private Map<Integer, Set<String>> weekToWorkers;

    public WorkerSchedule()
    {
        this.weekToWorkers = new HashMap<>();
        // Map<Integer, Set<String>> hola = new HashMap<>();



    }
    public void add (int x, Set<String> shifts )
    {
        weekToWorkers.put(x,shifts);


    }
    public void add (Set<Integer> week, ArrayList<String> workers)
    {

    }
    public boolean isWorkingOnWeek(String str, int x)
    {
        return true;
    }
    public Set<Integer> getWorkWeeks(String str)
    {
        return null;
    }
    

    @Override
    public String toString()
    {
        return " ";
    }

}
