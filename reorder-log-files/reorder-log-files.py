class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        #split the list into digit and letter
        digit = [log for log in logs if log.split()[1].isdigit() ]
        letter = [log for log in logs if log.split()[1].isalpha() ]
        
        #sort the letter list by its contents, if contents are the same, sort it by its identifier
        letter.sort(key = lambda x: (x.split()[1:],x.split()[0]))
        
        return letter + digit 