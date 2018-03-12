/**
 * A robot is located at the top-left corner of a m x n grid, trying to reach the bottom-right corner of the grid.
 * How many possible unique paths are there?
 * Above is a 3 x 7 grid. How many possible unique paths are there?
 * Constraints:
 * 1. The robot can only move either down or right at any point in time.
 * 2. m and n will be at most 100.
 */

"use strict";

var uniquePaths = function(m, n) {
    var map = [], temp, i, j;
        
    for (i = 0; i < m; i++) {
        temp = [];
        map.push(temp);
    }
    for (i = 0; i < n; i++) {
        map[0][i] = 1;
    }
    
    for (i = 0; i < m; i++) {
        map[i][0] = 1;
    }
    
    for (i = 1; i < m; i++) {
        for (j = 1; j < n; j++) {
            map[i][j] = map[i - 1][j] + map[i][j - 1];
        }
    }
    return map[m - 1][n - 1];
};

module.exports = uniquePaths;
