package org.cnu.realcoding.springbootpractice.api;


import org.cnu.realcoding.springbootpractice.domain.SummonerName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SummonerNameApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/_SvIzxbocfYJOE8yKO7FsH1WJsPiQJlMsU3jCEqDbV5sKg?api_key=RGAPI-d95196e4-96d5-4547-b722-4f3f72edfe17";

    public SummonerName getSummonerName(String sumName) {
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, SummonerName.class, sumName, "11f2163fd12dd1e311f57ed57347786a").getBody();
    }
}
