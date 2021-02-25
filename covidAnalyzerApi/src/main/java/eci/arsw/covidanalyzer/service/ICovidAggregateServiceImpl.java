package eci.arsw.covidanalyzer.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;

@Service
public class ICovidAggregateServiceImpl implements ICovidAggregateService{

	@Override
	public boolean aggregateResult(Result result, ResultType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getResult(ResultType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void upsertPersonWithMultipleTests(UUID id, ResultType type) {
		// TODO Auto-generated method stub
		
	}

}
