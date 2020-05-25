<div class='navigation' style=''>
<% String context=request.getContextPath(); %>
<!-- <ul id='headerNav'>
	<li><a href='/registration'>New Member Registration</a></li>	
	<li><a href='/viewMemberDetails'>View Member Details</a></li>
	<li><a href='/updateMemberDetails'>Update Member Details</a></li>
	
	<li><a href='/payMembershipAmmount'> Card Balance Panyment</a></li>
	<li><a href='/getCardBalance'> Check Card Balance Panyment</a></li>
	
	<li><a href='/paySubscriptionAmmount'>Subscription Payment</a></li>
	
	<li><a href='/sanctionLoan'>Loan Sanction</a></li>	
	<li><a href='/payLoanAmount'>Pay Loan Amount</a></li>
	
	<li><a href='/getLoanDetails'> Loan Payment History</a></li>
	<li><a href='/getMembersDetails'> Members Details</a></li>
		
</ul> -->

<div style="margin: 0 auto;width: 80%;height: auto;">
<ul id="navigationManu">
  <!-- <li><a href="#home">Home</a></li> -->
  <li><a href="<%=context %>/registrationForm">Register</a></li>
 
  <li><a href="<%=context %>/updateMemberDetails">Update Member Details</a></li>

  <li><a href="<%=context %>/paySubscriptionAmountForm">Subscriptions</a></li>

   <!--    <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Subscription</a>
    <div class="dropdown-content">
      <a href='/paySubscriptionAmountForm'>Subscription Payment</a>
      <a href='/getSubscriptionDetatils'>Subscription Detatils</a>
    </div>
  </li> -->
   <li><a href="<%=context %>/payMembershipAmount">Card Balance</a></li>
     <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Loans</a>
    <div class="dropdown-content">
	<a href='<%=context %>/sanctionLoanForm'>Loan Sanction</a>	
	<a href='<%=context %>/payLoanAmountForm'>Pay Loan Amount</a>
	<a href='<%=context %>/loanSummaryPage'>Loans Summary</a>
	<!--<a href='/getLoanDetails'> Loan Payment History</a>-->
    </div>
  </li>
  <li><a href="<%=context %>/search">Search</a></li>
   <li><a href="<%=context %>/logout">Logout</a></li>
</ul>
</div>
</div>