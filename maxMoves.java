static int maxMoves(String s, String t) 
    {
        StringBuilder sbS = new StringBuilder(s);
        StringBuilder sbT = new StringBuilder(t);
        String S = sbS.reverse().toString();
        String T = sbT.reverse().toString();
        
        int moves = 0;
        int moveS = 0;
        
        while(s.contains(t) == true)
        {
            s = s.replaceFirst(t,"");
            moves++;
        }
        
        while(S.contains(T) == true)
        {
            S = S.replaceFirst(T,"");
            moveS++;
        }
        
        if (moves > moveS)
            return moves;
        else
            return moveS;
    }
