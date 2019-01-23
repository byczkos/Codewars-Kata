
 // Write a simple function that takes as a parameter a date object and returns a boolean value representing whether the date is today or not.

//  Make sure that your function does not return a false positive by just checking just the day.

// URL:  https://www.codewars.com/kata/is-the-date-today/train/javascript

function isToday(date) {
  var todayDate = new Date();
  if(todayDate.setHours(0,0,0,0) == date.setHours(0,0,0,0)) {
	  return true;
  }
  return false;
}