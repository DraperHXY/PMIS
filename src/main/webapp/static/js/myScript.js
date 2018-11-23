function alertt() {
    alert("小老弟，绝望么");
}

function deleteHttpByName(URL, NAME) {
    var form = document.createElement("form");
    form.action = URL;
    form.method = "post";

    var inputHidden = document.createElement("input");
    inputHidden.type = "hidden";
    inputHidden.name = "_method";
    inputHidden.value = "DELETE";

    var inputTextValue = document.getElementsByName(NAME)[0].value;

    var inputText = document.createElement("input");
    inputText.type = "text";
    inputText.name = NAME;
    inputText.value = inputTextValue;

    form.appendChild(inputHidden);
    form.appendChild(inputText);
    document.body.appendChild(form);
    form.submit();
    alert(inputTextValue)
}

function getScreenHight() {
    var height = document.documentElement.clientHeight;
    return height;
}

function setFillScreenHeight() {
    document.getElementById("menu").style.height = getScreenHight() - 50 + "px";
}

function httpGetUrl(URL) {
    location = URL;
}

function httpDeleteUrl(URL) {
    var form = document.createElement("form");
    form.action = URL;
    form.method = "post";

    var inputHidden = document.createElement("input");
    inputHidden.type = "hidden";
    inputHidden.name = "_method";
    inputHidden.value = "DELETE";

    form.appendChild(inputHidden);
    document.body.appendChild(form);
    form.submit();
}