package election;

import election.candidate.Candidate;

public class Election
{
    private int [] voteCounts;
    
    public Election()
    {
        voteCounts = new int[Candidate.values().length];

    }

    public void addVote(Candidate candidate)
    {
        addVotes(candidate, 1);

    }
    public void addVotes(Candidate candidate, int n)
    {
        voteCounts[candidate.ordinal()] += n;
    }
    private int getCandidateCountWithMoreVotesThan(int index)
    {
        return 0;
    }
    public Candidate [] getCandidatesWithMoreVotesThan(int x)
    {
        return null;
    }
    public Candidate getWinner()
    {
        return Candidate.values()[getWinningIdx()];

    }
    private int getWinningIdx()
    {
        int tempWinner = 0;
        int tempVotes = 0;
        int i;
        for(i=0; i < voteCounts.length; i++)
        {
            if(voteCounts[i] > tempVotes) tempWinner = i;
        }
        if(tempVotes == 0)
        {
            return 0;
        }
        else
        {
            return i;
        }
    }
}