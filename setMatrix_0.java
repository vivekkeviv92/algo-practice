package test;

public class setMatrix_0 {

	public static void main(String[] args) {
	}
		// TODO Auto-generated method stub
		public static void SetZero( int [][] matrix, int m, int n )
		{
		    boolean[] row = new boolean[m];
		    boolean[] column = new boolean[n];
		    for( int i = 0; i < m; i++ )
		    {
		        for( int j = 0; j < n; j++ )
		        {
		            if( matrix[i][j] == 0 )
		            {
		                row[i] = true;            
		                column[j] = true;
		            }
		        }
		    }
		    for( int i = 0; i < m; i++ )
		    {
		        if( row[i] )
		        {
		            for( int j = 0; j < n; j++ )
		            {
		                matrix[i][j] = 0;
		            }
		        }
		    }
		    for( int j = 0; j < n; j++ )
		    {
		        if( column[j] )
		        {
		            for( int i = 0; i < m; i++ )
		            {
		                matrix[i][j] = 0;
		            }
		        }
		    }

	}

}
