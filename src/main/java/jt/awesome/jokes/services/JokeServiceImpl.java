package jt.awesome.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import jt.awesome.jokes.services.JokeService;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
