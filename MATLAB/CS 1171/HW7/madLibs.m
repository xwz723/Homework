function madLibs(blanks, words)
    wordList = fopen(words,'r')
    nouns = fgetl(wordList);
    verbs = fgetl(wordList);
    adj = fgetl(wordList);
    [nounList, remains] = strtok(nouns,',');
    while ~isempty(strfind(remains,','))
        [word, remains] = strtok(remains,',');
        nounList = [nounList, word];
    end
    nounList = [nounList, remains];
    
    [verbList, remains] = strtok(verbs,',');
    while ~isempty(strfind(remains,','))
        [word, remains] = strtok(remains,',');
        verbList = [verbList, word];
    end
    verbList = [verbList, remains];
    
    [adjList, remains] = strtok(adj,',');
    while ~isempty(strfind(remains,','))
        [word, remains] = strtok(remains,',');
        adjList = [adjList, word];
    end
    adjList = [adjList, remains];
    
    wordArr = [nounList; verbList; adjList];
    fclose(words);
    n = 1;
    v = 1;
    a = 1;
    
    letter = fopen(blanks, 'W');
end