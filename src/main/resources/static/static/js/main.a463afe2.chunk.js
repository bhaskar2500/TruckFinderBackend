(this.webpackJsonplogin=this.webpackJsonplogin||[]).push([[0],{116:function(e,t,n){"use strict";n.r(t);var c=n(6),i=n(0),o=n.n(i),a=n(9),r=n.n(a),s=(n(89),n(90),n(30)),l=n(50),u=n(26),d=n(56),j=n(156),h=n(158),b=n(152),O=n(153),g=n(155),f=n(70),p=n.n(f),x=n.p+"static/media/truck.3747aaaf.svg",v=n(150),y=n(151),m=n(148),k=n(149),A=n(72),L=n(45),C=n.n(L);function w(e){var t;return(t=console).log.apply(t,Object(A.a)(e)),Object(c.jsx)("div",{style:{position:"absolute",right:"100px"},children:Object(c.jsx)(j.a,{variant:"contained",color:"primary",onClick:function(e){return console.log(document.cookie),void C.a.get("http://localhost:8080/logout").then((function(e){return console.log(e)}))},children:" Logout "})})}var I=function(e){var t=Object(i.useState)(""),n=Object(d.a)(t,2),o=n[0],a=n[1],r=Object(i.useState)(""),s=Object(d.a)(r,2),l=s[0],u=s[1];return Object(i.useEffect)((function(){console.log(o,l)}),[]),Object(c.jsxs)("div",{children:[Object(c.jsx)(m.a,{position:"fixed",children:Object(c.jsxs)(k.a,{style:{backgroundColor:"#000"},children:[Object(c.jsx)("div",{children:"Mechanic"}),e.isAuthenticated?Object(c.jsx)(w,{type:"button",children:" "}):null]})}),Object(c.jsx)("div",{style:{overflow:"hidden",backgroundImage:"url(".concat(x,")"),backgroundPositionX:-250,backgroundBlendMode:"luminosity",backgroundColor:"rgba(0, 0, 0, 0.7)"},children:Object(c.jsx)(g.a,{display:"flex",justifyContent:"center",alignItems:"center",minHeight:"100vh",minWidth:"200vh",children:Object(c.jsx)(v.a,{className:p.a.loginCard,style:{width:"400px"},elevation:24,children:Object(c.jsx)(y.a,{children:Object(c.jsxs)(b.a,{children:[Object(c.jsx)(h.a,{children:Object(c.jsx)(O.a,{fullWidth:!0,value:o,onChange:function(e){return a(e.target.value)},placeholder:"Username",style:{display:"block",padding:"10px"}})}),Object(c.jsxs)(h.a,{children:["  ",Object(c.jsx)(O.a,{fullWidth:!0,value:l,onChange:function(e){return u(e.target.value)},placeholder:"Password",type:"password",style:{display:"block",padding:"10px"}})]}),Object(c.jsxs)(h.a,{children:[Object(c.jsx)(j.a,{variant:"contained",color:"primary",onClick:function(t){return function(t){t.preventDefault(),e.sendLogin()}(t)},fullWidth:!0,children:" Login "}),"   "]})]})})})})})]})},S=n(12),E=function(e,t){return function(n){var c={Authorization:"Basic "+window.btoa(e+":"+t)};C.a.get("http://localhost:8080/login/basic",{headers:c}).then((function(e){return console.log(e),n({type:"LOGIN_USER",isAuthenticated:!0})})).catch((function(e){return console.log("error"),n({type:"LOGIN_USER",isAuthenticated:!1})}))}};var N=Object(l.b)((function(e){return{userName:e.userName,isAuthenticated:e.isAuthenticated}}),(function(e){return Object(s.a)({},Object(u.b)({sendLogin:E},e))}))((function(e){var t=Object(S.f)();return e.isAuthenticated&&t.push("/home"),console.log(e,"----"),Object(c.jsx)("div",{children:Object(c.jsx)(I,{sendLogin:e.sendLogin,isAuthenticated:e.isAuthenticated})})}));function F(){return Object(c.jsx)("div",{children:"Home page"})}var U=n(43),B={isAuthenticated:!1};var P=n(71),W=Object(u.c)((function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:B,t=arguments.length>1?arguments[1]:void 0;switch(t.type){case"LOGIN_USER":return Object(s.a)(Object(s.a)({},e),{},{isAuthenticated:t.isAuthenticated});default:return Object(s.a)(Object(s.a)({},e),{},{something:"DEFAULT"})}}),Object(u.a)(P.a));var D=function(){return Object(c.jsx)(l.a,{store:W,children:Object(c.jsx)(U.a,{children:Object(c.jsxs)(S.c,{children:[Object(c.jsxs)(S.a,{path:"/",children:[" ",Object(c.jsx)(N,{})," "]}),Object(c.jsxs)(S.a,{path:"/home",children:[" ",Object(c.jsx)(F,{})," "]})]})})})},G=function(e){e&&e instanceof Function&&n.e(3).then(n.bind(null,160)).then((function(t){var n=t.getCLS,c=t.getFID,i=t.getFCP,o=t.getLCP,a=t.getTTFB;n(e),c(e),i(e),o(e),a(e)}))};r.a.render(Object(c.jsx)(o.a.StrictMode,{children:Object(c.jsx)(D,{})}),document.getElementById("root")),G()},70:function(e,t,n){},89:function(e,t,n){},90:function(e,t,n){}},[[116,1,2]]]);
//# sourceMappingURL=main.a463afe2.chunk.js.map