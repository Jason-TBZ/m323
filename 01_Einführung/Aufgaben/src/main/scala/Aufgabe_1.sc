def calculateScore(word: String) = {
  var score = 0
  for (c <- word.toCharArray) {
    score += 1
  }
  score
}

def wordScore(word: String) = word.length
