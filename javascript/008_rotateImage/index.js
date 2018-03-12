/**
 * Given an n x n 2D matrix representing an image, Rotate the image by 90 degrees (clockwise).
 */

/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */

"use strict";

var rotateImage = function (matrix) {
  if (!Array.isArray(matrix)) {
    return;
  }
  var matrixLength = matrix.length;
  if (matrixLength <= 1) {
    return;
  }
  var i, j, temp;

  var halfMatrixLength = Math.floor(matrixLength / 2);
  for (i = 0; i < halfMatrixLength; i++) {
    for (j = 0; j < halfMatrixLength; j++) {
      temp = matrix[i][j];
      matrix[i][j] = matrix[matrixLength - j - 1][i];
      matrix[matrixLength - j - 1][i] = matrix[matrixLength - i - 1][matrixLength - j - 1];
      matrix[matrixLength - i - 1][matrixLength - j - 1] = matrix[j][matrixLength - i - 1];
      matrix[j][matrixLength - i - 1] = temp;
    }
  }
  console.log(matrix);
  if (matrix.length % 2 === 0) {
    return;
  }
  j = halfMatrixLength;
  for (i = 0; i < halfMatrixLength; i++) {
    temp = matrix[i][j];
    matrix[i][j] = matrix[matrixLength - j - 1][i];
    matrix[matrixLength - j - 1][i] = matrix[matrixLength - i - 1][matrixLength - j - 1];
    matrix[matrixLength - i - 1][matrixLength - j - 1] = matrix[j][matrixLength - i - 1];
    matrix[j][matrixLength - i - 1] = temp;
  }
  return;
};

module.exports = rotateImage;