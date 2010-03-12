/*
 * Copyright 2002-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.integration.loanbroker;

import java.util.List;

import org.springframework.integration.loanbroker.domain.LoanQuote;
import org.springframework.integration.loanbroker.domain.LoanRequest;

/**
 * POJI Gateway which connects method invocations to the request-channel
 * completely isolating SI developer from SI API details.
 * 
 * @author Oleg Zhurakousky
 *
 */
public interface LoanBrokerGateway {
	/**
	 * Will return the best {@link LoanQuote}
	 * 
	 * @param loanRequest
	 * @return
	 */
	public LoanQuote getLoanQuote(LoanRequest loanRequest);
	/**
	 * Will return all {@link LoanQuote}s
	 * @param loanRequest
	 * @return
	 */
	public List<LoanQuote> getAllLoanQuotes(LoanRequest loanRequest);
}
