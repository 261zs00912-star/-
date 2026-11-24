const results = ["大吉", "中吉", "小吉", "吉", "末吉"];

document.getElementById("btn").onclick = function() {
  let num = Math.floor(Math.random() * results.length);
  document.getElementById("result").textContent = results[num];
};
